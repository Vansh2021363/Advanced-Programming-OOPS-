package com.example.demo;

import java.util.Random;

public class Platform {
    private Random r = new Random();
    private int breadth;
    //Some pre-defined y
    private int x;
    private int lowerx;
    private int upperx;

    public Platform(int l, int u) {
        this.x=0;
        this.lowerx=l;
        this.upperx=u;
    }

    public int getBreadth() {return 0;}

    public void setBreadth(int breadth) {}

    public int generatePlatformpos() {

        while (x<=lowerx)
        {
            x=r.nextInt(upperx);
        }
        return x;



    }
    public int generatePlatformbreadth() {
        while (breadth<=lowerx)
        {
            breadth=r.nextInt(x);
        }
        return breadth;
    }
}
