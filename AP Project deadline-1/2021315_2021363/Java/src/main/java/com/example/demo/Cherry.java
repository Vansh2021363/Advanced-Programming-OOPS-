package com.example.demo;

import java.io.Serializable;
import java.util.*;

public class Cherry implements Serializable {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int x;

    public int getY() {
        return y;
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public void setY(int y) {
        this.y = y;
    }

    int y;
    boolean exist;

    public boolean generateExistance () {return true;}

    public int setPositionx() {return 0;}

}
