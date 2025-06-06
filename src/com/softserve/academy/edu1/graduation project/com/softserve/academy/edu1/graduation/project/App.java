package com.softserve.academy.edu1.graduation.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("PacMan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setResizable(true);
        frame.setVisible(true);

        CardLayout cardLayout = new CardLayout();
        JPanel root = new JPanel(cardLayout);

        // Main Menu
        JPanel menu = new JPanel();
        menu.setBackground(Color.BLACK);
        menu.setLayout(new GridBagLayout());
        JButton startBtn = new JButton("Start Game");
        JButton leaderboardBtn = new JButton("Leaderboard");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        menu.add(startBtn, gbc);
        gbc.gridy = 1;
        menu.add(leaderboardBtn, gbc);

        // Game Panel
        PacMan gamePanel = new PacMan(() -> cardLayout.show(root, "Menu"));

        root.add(menu, "Menu");
        root.add(gamePanel, "Game");


        frame.setPreferredSize(new Dimension(800, 800));
        frame.add(root);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        // Button Listeners
        startBtn.addActionListener(e -> {
            cardLayout.show(root, "Game");
            gamePanel.requestFocusInWindow();
            gamePanel.revalidate();
            gamePanel.repaint();
            gamePanel.startGame();
        });

        leaderboardBtn.addActionListener(e -> gamePanel.showLeaderboard(frame));

        // Window Resize Listener
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                gamePanel.updateScale(frame.getContentPane().getWidth(), frame.getContentPane().getHeight());
            }
        });
    }
}