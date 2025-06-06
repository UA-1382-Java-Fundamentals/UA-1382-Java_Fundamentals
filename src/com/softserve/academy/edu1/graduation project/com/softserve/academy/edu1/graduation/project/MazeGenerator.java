package com.softserve.academy.edu1.graduation.project;

import java.util.*;

public class MazeGenerator {
    private final int rows, cols;
    private final char[][] maze;
    private final Random rand = new Random();

    public MazeGenerator(int rows, int cols) {
        // Must be odd for proper maze
        this.rows = rows | 1;
        this.cols = cols | 1;
        this.maze = new char[this.rows][this.cols];
    }

    public char[][] generate() {
        // Fill all with walls
        for (int r = 0; r < rows; r++)
            Arrays.fill(maze[r], '#');

        // DFS Maze carve
        carve(1, 1);
        addLoops((rows * cols) / 10);

        // Place power pellets in corners
        maze[1][1] = 'o';
        maze[1][cols - 2] = 'o';
        maze[rows - 2][1] = 'o';
        maze[rows - 2][cols - 2] = 'o';

        // Fill rest with dots (pellets)
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (maze[r][c] == ' ') maze[r][c] = '.';
            }
        }

        // Optionally open a ghost pen in the center
        int midRow = rows / 2, midCol = cols / 2;
        for (int dr = -1; dr <= 1; dr++)
            for (int dc = -2; dc <= 2; dc++)
                maze[midRow + dr][midCol + dc] = ' ';

        return maze;
    }

    private void carve(int r, int c) {
        maze[r][c] = ' ';
        int[] dirs = {0, 1, 2, 3};
        shuffleArray(dirs);

        for (int dir : dirs) {
            int nr = r, nc = c;
            switch (dir) {
                case 0:
                    nr = r - 2;
                    break; // up
                case 1:
                    nr = r + 2;
                    break; // down
                case 2:
                    nc = c - 2;
                    break; // left
                case 3:
                    nc = c + 2;
                    break; // right
            }
            if (inBounds(nr, nc) && maze[nr][nc] == '#') {
                maze[(r + nr) / 2][(c + nc) / 2] = ' ';
                carve(nr, nc);
            }
        }
    }

    private void addLoops(int numLoops) {
        int attempts = 0, added = 0;
        while (added < numLoops && attempts < numLoops * 5) {
            int r = 2 + rand.nextInt(rows - 4);
            int c = 2 + rand.nextInt(cols - 4);
            if (maze[r][c] == '#') {
                boolean vertical = maze[r-1][c] == ' ' && maze[r+1][c] == ' ';
                boolean horizontal = maze[r][c-1] == ' ' && maze[r][c+1] == ' ';
                if ((vertical || horizontal) && !createsOpen2x2(r, c)) {
                    maze[r][c] = ' ';
                    added++;
                }
            }
            attempts++;
        }
    }

    private boolean createsOpen2x2(int r, int c) {
        for (int dr = -1; dr <= 0; dr++) {
            for (int dc = -1; dc <= 0; dc++) {
                int countOpen = 0;
                for (int rr = 0; rr <= 1; rr++) {
                    for (int cc = 0; cc <= 1; cc++) {
                        int nr = r + dr + rr, nc = c + dc + cc;
                        if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                            if ((nr == r && nc == c) || maze[nr][nc] == ' ')
                                countOpen++;
                        }
                    }
                }
                if (countOpen == 4) return true;
            }
        }
        return false;
    }

    private boolean inBounds(int r, int c) {
        return r > 0 && r < rows - 1 && c > 0 && c < cols - 1;
    }

    private void shuffleArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
}
