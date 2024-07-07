package com.example.demo;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.ArrayList;

public class Hero {
    private static int p_id=0;
    private int x1;
    private int y1;
    private int points;
    private int strawberries;
    private boolean isAlive;
    private int deaths;
    private Platform platform;

    private Rectangle hero;
    private Stage stage;
    private Scene scene;

    public Hero() {
        p_id++;
        this.points=0;
        this.strawberries=0;
        this.isAlive=true;
        this.deaths=0;
        this.platform=new Platform(10,10);

        hero = new Rectangle(20, 40, Color.RED);
        hero.setLayoutX(20);
        hero.setLayoutY(200);
    }

    public Rectangle getHero() {
        return hero;
    }

    public void swithToWinScreen() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Win-Screen.fxml"));
        stage = new Stage();
        scene = new Scene (root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToGameOverScreen() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Game-Over-Screen.fxml"));
        stage = new Stage();
        scene = new Scene (root);
        stage.setScene(scene);
        stage.show();
    }
    Stick moveHero(Stick stick, Pane pane, ArrayList<Pillar> pillars) {
        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(1000), hero);
        translateTransition.setByX(stick.getStick().getHeight() + hero.getWidth());
        translateTransition.play();
        Stick stick1 = new Stick(5);
        translateTransition.setOnFinished(actionEvent -> {
            boolean gameOver = true;
            boolean win = false;

            for (Pillar pillar : pillars) {
                if (hero.getBoundsInParent().intersects(pillar.getPillar().getBoundsInParent())) {
                    stick1.getStick().setX(stick.getStick().getHeight() + hero.getWidth() + stick.getStick().getX());
                    pane.getChildren().add(stick1.getStick());
                    gameOver = false;

                    if (pillar == pillars.get(pillars.size() - 1)) {
                        win = true;
                    }
                    break;
                }
            }

            if (gameOver) {
                TranslateTransition tt = new TranslateTransition(Duration.millis(1000), hero);
                tt.setByY(650);
                tt.play();
                //Stage stage = new Stage();

                try {
                    switchToGameOverScreen();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }

            else if(win) {
                RotateTransition rotateTransition = new RotateTransition(Duration.millis(1000), hero);
                rotateTransition.setByAngle(720);
                rotateTransition.play();

                try {
                    swithToWinScreen();
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        return stick1;
    }

    public int getX1() {return 0;}

    public int getY1() {return 0;}

    public int getPoints() {return 0;}

    public int getStrawberries() {return 0;}

    public boolean getisAlive() {return isAlive;}

    public int getdeaths() {return 0;}

    public void setX1(int x1) {}

    public void setY1(int y1) {}

    public void setPoints(int points) {}

    public void setStrawberries(int strawberries) {}

    public void setisAlive(boolean isAlive) {this.isAlive=isAlive;}

    public void setDeaths(int deaths) {}

    public void move() {}
}
