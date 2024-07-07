package com.example.demo;

import java.io.Serializable;
import java.util.*;

public class Platform implements Serializable {
    double breadth;
    Cherry cherry = new Cherry();

    public Platform() {}

    public int getBreadth() {return 0;}

    public void setBreadth(double breadth) {}

    public double generateBreadth() {return 0;}
}
