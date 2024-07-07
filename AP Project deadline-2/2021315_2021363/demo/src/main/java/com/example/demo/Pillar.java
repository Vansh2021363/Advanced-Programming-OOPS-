package com.example.demo;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Pillar {
    private Rectangle pillar;

    public Pillar(double width, double posX) {
        pillar = new Rectangle(width, 200);
        pillar.setX(posX);
        pillar.setY(240);
    }

    public Rectangle getPillar() {
        return pillar;
    }

    public void setColor (Color color) {
        pillar.setFill(color);
    }
}
