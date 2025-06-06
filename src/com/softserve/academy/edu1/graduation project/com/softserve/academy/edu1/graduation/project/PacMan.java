package com.softserve.academy.edu1.graduation.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.List;

public class PacMan extends JPanel implements ActionListener, KeyListener {

    // Maze & Map state
    private char[][] map;
    private boolean[][] pellets;
    private int COLS, ROWS;
    private int TILE = 16;
    private int baseWidth, baseHeight;

    // Game State
    private static final int INITIAL_LIVES = 3;
    private int lives;

    private double scaleX = 1.0, scaleY = 1.0;

    private int pacX, pacY;
    private int dirX, dirY;
    private int nextDirX, nextDirY;

    private int score;
    private boolean running;
    private javax.swing.Timer timer;

    // Power Pellet / Scared Ghost Logic
    private boolean ghostsScared = false;
    private long scaredEndTime = 0;
    private static final int SCARED_DURATION_MS = 10_000;

    // Ghosts
    private static final int GHOST_SPEED = 2;
    private int GHOST_START_ROW, GHOST_START_COL;
    private Image blueGhostImg, orangeGhostImg, pinkGhostImg, redGhostImg, scaredGhostImg;
    private final List<Ghost> ghosts = new ArrayList<>();

    private final Runnable exitToMenu;

    // Constructor
    public PacMan(Runnable exitToMenu) {
        this.exitToMenu = exitToMenu;
        setFocusable(true);
        addKeyListener(this);
    }

    // Game info
    public void startGame() {
        lives = INITIAL_LIVES;
        initState();
        running = true;
        timer = new javax.swing.Timer(1000 / 60, this);
        timer.start();
    }

    private void initState() {
        // MazeRandomizer
        MazeGenerator mg = new MazeGenerator(27, 28);
        map = mg.generate();
        ROWS = map.length;
        COLS = map[0].length;
        baseWidth  = COLS * TILE;
        baseHeight = ROWS * TILE;

        setPreferredSize(new Dimension(baseWidth, baseHeight));
        revalidate();

        // Pac-Man start position
        int startRow = ROWS - 2, startCol = COLS / 2;
        while (map[startRow][startCol] == '#') startRow--;
        pacX = startCol * TILE;
        pacY = startRow * TILE;
        dirX = -1; dirY = 0;
        nextDirX = nextDirY = 0;
        score = 0;

        // Pellets
        pellets = new boolean[ROWS][COLS];
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                char ch = map[r][c];
                pellets[r][c] = (ch == '.' || ch == 'o');
            }
        }

        // Ghost start position
        int penRow = ROWS / 2, penCol = COLS / 2;
        while (map[penRow][penCol] == '#') penCol++;

        GHOST_START_ROW = penRow;
        GHOST_START_COL = penCol;

        loadGhostImages();

        // Reset ghosts
        ghosts.clear();
        ghosts.add(new Ghost(GHOST_START_COL    , GHOST_START_ROW, redGhostImg));
        ghosts.add(new Ghost(GHOST_START_COL + 1, GHOST_START_ROW, pinkGhostImg));
        ghosts.add(new Ghost(GHOST_START_COL - 1, GHOST_START_ROW, orangeGhostImg));
        ghosts.add(new Ghost(GHOST_START_COL + 2, GHOST_START_ROW, blueGhostImg));
    }

    private void loadGhostImages() {
        blueGhostImg   = new ImageIcon(getClass().getResource("/blueGhost.png")).getImage();
        orangeGhostImg = new ImageIcon(getClass().getResource("/orangeGhost.png")).getImage();
        pinkGhostImg   = new ImageIcon(getClass().getResource("/pinkGhost.png")).getImage();
        redGhostImg    = new ImageIcon(getClass().getResource("/redGhost.png")).getImage();
        scaredGhostImg = new ImageIcon(getClass().getResource("/scaredGhost.png")).getImage();
    }

    private void finishGame() {
        running = false;
        if (timer != null) timer.stop();
        endGame(score);
    }

    private void resetPellets(){
        pellets = new boolean[ROWS][COLS];
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                char ch = map[r][c];
                pellets[r][c] = (ch == '.' || ch == 'o');
            }
        }
    }

    // Maze Logic
    private boolean isWall(int row, int col) {
        if (row < 0 || row >= ROWS || col < 0 || col >= COLS) return true;
        return map[row][col] == '#';
    }

    private boolean collides(int x, int y) {
        int left   = x;
        int right  = x + TILE - 1;
        int top    = y;
        int bottom = y + TILE - 1;
        return isWall(top / TILE,    left  / TILE) ||
                isWall(top / TILE,    right / TILE) ||
                isWall(bottom / TILE, left  / TILE) ||
                isWall(bottom / TILE, right / TILE);
    }

    // Ghost Entity
    private class Ghost {
        int x, y;
        int dirX, dirY;
        final Image img;
        boolean alive = true;
        final int startX, startY;
        boolean immuneUntilSafe = false;

        Ghost(int col, int row, Image img) {
            this.x = col * TILE;
            this.y = row * TILE;
            this.startX = this.x;
            this.startY = this.y;
            this.img = img;
            this.dirX = 0; this.dirY = -1;
            this.alive = true;
        }

        void chooseDir() {
            if (x % TILE != 0 || y % TILE != 0) return;

            List<int[]> options = new ArrayList<>();
            int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

            int openPaths = 0;
            for (int[] d : dirs) {
                int nr = y / TILE + d[1], nc = x / TILE + d[0];
                if (!isWall(nr, nc)) openPaths++;
            }

            if (openPaths >= 3 || isWall((y / TILE) + dirY, (x / TILE) + dirX)) {
                for (int[] d : dirs) {
                    int nr = y / TILE + d[1], nc = x / TILE + d[0];
                    // Allows reverse if stuck
                    boolean isReverse = (d[0] == -dirX && d[1] == -dirY);
                    if (!isWall(nr, nc) && (openPaths <= 1 || !isReverse)) {
                        options.add(d);
                    }
                }
                if (!options.isEmpty()) {
                    int[] pick = options.get((int)(Math.random() * options.size()));
                    dirX = pick[0]; dirY = pick[1];
                }
            }
        }

        void move() {
            if (!alive) return;
            int speed = (ghostsScared && !immuneUntilSafe) ? Math.max(1, GHOST_SPEED - 1) : GHOST_SPEED;

            for (int i = 0; i < speed; i++) {
                int tryX = x + dirX;
                int tryY = y + dirY;
                if (collides(tryX, tryY)) {
                    chooseDir();
                    return;
                }
                x = tryX;
                y = tryY;
            }
            if (x % TILE == 0 && y % TILE == 0) chooseDir();
        }

        void respawn() {
            this.x = startX;
            this.y = startY;
            this.dirX = 0; this.dirY = -1;
            this.alive = true;
            this.immuneUntilSafe = false;
        }

        Rectangle rect() {
            return new Rectangle(x, y, TILE, TILE);
        }
    }

    // Loop
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!running) return;

        // End scared ghost mode
        if (ghostsScared && System.currentTimeMillis() > scaredEndTime) {
            ghostsScared = false;
            for (Ghost g : ghosts) g.immuneUntilSafe = false;
            repaint();
        }

        handlePacmanDirection();
        movePacMan();
        eatPellet();

        if (allPelletsEaten()) {
            resetPellets();
            resetPositions();
            return;
        }

        moveGhosts();
        checkGhostCollisions();
        repaint();
    }

    private void handlePacmanDirection() {
        if (nextDirX != 0 || nextDirY != 0) {
            if (pacX % TILE == 0 && pacY % TILE == 0) {
                int newRow = (pacY / TILE) + nextDirY;
                int newCol = (pacX / TILE) + nextDirX;
                if (!isWall(newRow, newCol)) {
                    dirX = nextDirX;
                    dirY = nextDirY;
                }
            }
        }
    }

    private void movePacMan() {
        for (int step = 0; step < 2; step++) {
            int tryX = pacX + dirX;
            int tryY = pacY + dirY;
            if (collides(tryX, tryY)) {
                dirX = 0;
                dirY = 0;
                break;
            }
            pacX = tryX;
            pacY = tryY;
        }
    }

    private void eatPellet() {
        if (pacX % TILE == 0 && pacY % TILE == 0) {
            int row = pacY / TILE;
            int col = pacX / TILE;
            if (pellets[row][col]) {
                if (map[row][col] == 'o') {
                    activateScaredMode();
                }
                pellets[row][col] = false;
                score += 10;
            }
        }
    }

    private void activateScaredMode() {
        ghostsScared = true;
        scaredEndTime = System.currentTimeMillis() + SCARED_DURATION_MS;
        for (Ghost g : ghosts) {
            if (!g.alive) g.immuneUntilSafe = true;
        }
    }

    private void moveGhosts() {
        for (Ghost g : ghosts) g.move();
    }

    private void checkGhostCollisions() {
        for (Ghost g : ghosts) {
            if (!g.alive) continue;
            if (g.rect().intersects(new Rectangle(pacX, pacY, TILE, TILE))) {
                if (ghostsScared && !g.immuneUntilSafe) {
                    g.alive = false;
                    g.immuneUntilSafe = true;
                    score += 500;
                    // Respawn after short delay (1 sec)
                    new java.util.Timer().schedule(new java.util.TimerTask() {
                        public void run() {
                            g.respawn();
                            repaint();
                        }
                    }, 1000);
                } else {
                    loseLife();
                    return;
                }
            }
        }
    }

    private void loseLife() {
        lives--;
        if (lives > 0) {
            resetPositions();
            repaint();
        } else {
            finishGame();
        }
    }

    private void resetPositions() {
        // Pac-Man start position
        int startRow = ROWS - 2, startCol = COLS / 2;
        while (map[startRow][startCol] == '#') startRow--;
        pacX = startCol * TILE;
        pacY = startRow * TILE;
        dirX = -1;
        dirY = 0;
        nextDirX = nextDirY = 0;

        ghosts.clear();
        ghosts.add(new Ghost(GHOST_START_COL    , GHOST_START_ROW, redGhostImg));
        ghosts.add(new Ghost(GHOST_START_COL + 1, GHOST_START_ROW, pinkGhostImg));
        ghosts.add(new Ghost(GHOST_START_COL - 1, GHOST_START_ROW, orangeGhostImg));
        ghosts.add(new Ghost(GHOST_START_COL + 2, GHOST_START_ROW, blueGhostImg));
    }

    private boolean allPelletsEaten() {
        for (int r = 0; r < ROWS; r++)
            for (int c = 0; c < COLS; c++)
                if (pellets[r][c]) return false;
        return true;
    }

    // Rendering
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(scaleX, scaleY);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        drawBackground(g2);
        drawWalls(g2);
        drawPellets(g2);
        drawGhosts(g2);
        drawPacMan(g2);
        drawScore(g2);
    }

    private void drawBackground(Graphics2D g2) {
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, baseWidth, baseHeight);
    }

    private void drawWalls(Graphics2D g2) {
        g2.setColor(new Color(0, 0, 255));
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (map[r][c] == '#') {
                    g2.fillRect(c * TILE, r * TILE, TILE, TILE);
                }
            }
        }
    }

    private void drawPellets(Graphics2D g2) {
        g2.setColor(Color.WHITE);
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (pellets[r][c]) {
                    int size = (map[r][c] == 'o') ? 8 : 4;
                    int px   = c * TILE + (TILE - size) / 2;
                    int py   = r * TILE + (TILE - size) / 2;
                    g2.fillOval(px, py, size, size);
                }
            }
        }
    }

    private void drawGhosts(Graphics2D g2) {
        for (Ghost gh : ghosts) {
            if (!gh.alive) continue;
            Image ghostImg = (ghostsScared && !gh.immuneUntilSafe) ? scaredGhostImg : gh.img;
            if (ghostImg != null && ghostImg.getWidth(null) > 0) {
                g2.drawImage(ghostImg, gh.x, gh.y, TILE, TILE, this);
            } else {
                g2.setColor(ghostsScared && !gh.immuneUntilSafe ? Color.BLUE : Color.MAGENTA);
                g2.fillOval(gh.x, gh.y, TILE, TILE);
            }
        }
    }

    private void drawPacMan(Graphics2D g2) {
        g2.setColor(Color.YELLOW);
        int mouthAngle = (int) ((System.currentTimeMillis() / 75) % 45);
        g2.fillArc(pacX, pacY, TILE, TILE, mouthAngle + dirToAngle(), 360 - 2 * mouthAngle);
    }

    private void drawScore(Graphics2D g2) {
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Arial", Font.BOLD, 18));
        g2.drawString("Score: " + score, 10, 20);

        int offset = 0;
        for (int i = 0; i < lives; i++) {
            g2.setColor(Color.YELLOW);
            g2.fillArc(120 + offset, 8, 14, 14, 45, 270);
            offset += 20;
        }
    }

    private int dirToAngle() {
        if (dirX == 1) return 0;
        if (dirX == -1) return 180;
        if (dirY == -1) return 90;
        return 270;
    }

    // Scaling
    public void updateScale(int newW, int newH) {
        scaleX = (double) newW / baseWidth;
        scaleY = (double) newH / baseHeight;
        revalidate();
        repaint();
    }

    // Leaderboard
    private void appendScore(String name, int score) {
        String entry = name + " : " + score;
        Path path = Paths.get("leaderboard.txt");
        try {
            Files.write(path, Collections.singleton(entry), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void endGame(int finalScore) {
        String name = JOptionPane.showInputDialog(this, "Game Over!\nYour score: " + finalScore + "\nEnter your name:");
        if (name != null && !name.trim().isEmpty()) {
            appendScore(name.trim(), finalScore);
        }
        if (exitToMenu != null) exitToMenu.run();
    }

    public void showLeaderboard(Component parent) {
        Path path = Paths.get("leaderboard.txt");
        List<String> lines = new ArrayList<>();
        if (Files.exists(path)) {
            try {
                lines = Files.readAllLines(path);
                lines.sort((a, b) -> Integer.compare(parseScore(b), parseScore(a)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (lines.isEmpty()) {
            JOptionPane.showMessageDialog(parent, "No scores yet.", "Leaderboard", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder sb = new StringBuilder("Leaderboard:\n");
            int rank = 1;
            for (String line : lines) {
                sb.append(rank++).append(". ").append(line).append("\n");
                if (rank > 10) break;
            }
            JOptionPane.showMessageDialog(parent, sb.toString(), "Leaderboard", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private int parseScore(String line) {
        try {
            return Integer.parseInt(line.replaceAll(".*:", "").trim());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // Key Management
    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT  -> { nextDirX = -1; nextDirY = 0; }
            case KeyEvent.VK_RIGHT -> { nextDirX =  1; nextDirY = 0; }
            case KeyEvent.VK_UP    -> { nextDirX =  0; nextDirY = -1; }
            case KeyEvent.VK_DOWN  -> { nextDirX =  0; nextDirY =  1; }
            case KeyEvent.VK_ESCAPE -> finishGame();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { }
}
