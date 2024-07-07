package com.example.demo;

public class Cherry {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int x;

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

    private int y;
    private boolean exist;

    public boolean generateExistance () {return true;}

    public int setPositionx() {return 0;}

}
