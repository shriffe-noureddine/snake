package com.company;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snake {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame F = new JFrame();
                F.setTitle("Snake");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel P = new SnakePanel();

                F.getContentPane().add(P);

                F.setSize(400, 400);
                F.setVisible(true);
            }
        });
    }
}
