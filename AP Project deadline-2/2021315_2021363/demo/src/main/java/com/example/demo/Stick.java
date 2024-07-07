package com.example.demo;

import javafx.animation.RotateTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;


public class Stick {
    int x1;

    private Rectangle stick;
    private Rotate rotate;

    public Stick(int height) {
        this.height=height;
        stick = new Rectangle(2, 2, Color.BLACK);
        stick.setLayoutX(41);
        stick.setLayoutY(240);

        rotate = new Rotate();
        stick.getTransforms().add(rotate);
    }

    public Rectangle getStick() {
        return stick;
    }

    public void incLength() {
        stick.setLayoutY(stick.getLayoutY() - 5);
        stick.setHeight(stick.getHeight() + 5);
    }

    public void decLength() {
        if (stick.getLayoutY() < 240) {
            stick.setLayoutY(stick.getLayoutY() + 5);
            stick.setHeight(stick.getHeight() - 5);
        }
    }

    public double stickHeight() {
        return stick.getHeight();
    }

    public void rotateStick() {
        stick.setTranslateY(-stick.getHeight());
        RotateTransition rotateTransition = new RotateTransition(Duration.millis(1000), stick);
        rotateTransition.setAxis(Rotate.Z_AXIS);
        rotateTransition.setByAngle(90);
        rotateTransition.play();
    }

    public void rotate() {
        rotate.setAngle(90);
        rotate.setPivotX(stick.getX() + stick.getWidth()/2);
        rotate.setPivotY(stick.getY() + stick.getHeight());
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    int y1;

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    int x2;

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    int y2;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int height;

    public int getFx() {
        return fx;
    }

    public int getFy() {
        return fy;
    }

    public void setFy(int fy) {
        this.fy = fy;
    }

    public void setFx(int fx) {
        this.fx = fx;
    }

    int fx;
    int fy;

    public Stick(int x1, int y1) {}


}
