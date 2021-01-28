package com;

public class Vect {
    public double x;
    public double y;
    /**
     * Make a random vector for the next step of point
     * */
    public Vect(){
        double magnitude =  Math.random()*30 ;      //max step equal to 30
        double angle = Math.random()*(Math.PI*10) ; //max angle equal to (10 rad)
        this.x = magnitude * Math.cos(angle) ;
        this.y = magnitude * Math.sin(angle) ;
    }
}
