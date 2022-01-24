package com.company;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.BoundedRangeModel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;

public class SnakePanel extends JPanel implements MouseMotionListener, ActionListener {

    ArrayList<Point> A = new ArrayList<Point>();

    int x;
    int y;

    public SnakePanel() {
        addMouseMotionListener(this);
        setBackground(Color.WHITE);

        Timer timer = new Timer(50, this);
        timer.start();
    }

    public void paintComponent(Graphics G) {
        super.paintComponent(G);

        Graphics2D G2 = (Graphics2D) G;

        // ADD CODE HERE
        for (Point point : A) {
            G2.setColor(Color.blue);
            G2.fillOval((int) point.getX(), (int) point.getY(), 10, 10);
        }

    }

    @Override
    public void mouseDragged(MouseEvent e) {

        // TODO Auto-generated method stub

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        x = e.getX();
        y = e.getY();

        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // ADD CODE HERE
        A.add(new Point(x, y));
        if (A.size() > 10) {
            A.remove(A.get(0));
        }
        repaint();
    }
}
