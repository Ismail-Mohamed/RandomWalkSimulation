package com;

import java.awt.geom.Ellipse2D;

public class Drone {
    public double xPos;
    public double yPos;

    public Drone(double xStart, double yStart) {
        this.xPos = xStart;
        this.yPos = yStart;
    }
    /**
     * draw point to represent the drone
     */
    public Ellipse2D drone2D(){
        return new Ellipse2D.Double(this.xPos,this.yPos,10,10);
    }

    public void move(Vect v){
        this.xPos += v.x;
        this.yPos += v.y;
    }

}
