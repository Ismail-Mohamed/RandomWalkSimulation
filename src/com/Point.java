package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Point extends JPanel implements ActionListener {

    //starting point position
    Drone d1 = new Drone(400, 400);
    Drone d2 = new Drone(400, 400);


    // timer to reset every 50 (ms)
    Timer timer = new Timer(70, this);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Panel Background color
        this.setBackground(Color.GRAY);
        //cast graphic to Graphic2D for more 2D options
        Graphics2D G2D = (Graphics2D) g;

        G2D.setColor(Color.BLACK);
        G2D.fill(d1.drone2D());
        G2D.setColor(Color.MAGENTA);
        G2D.fill(d2.drone2D());
        //start timer every repaint() call
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // move drones
        d1.move(new Vect());
        d2.move(new Vect());
        // repaint points
        repaint();
    }

}

