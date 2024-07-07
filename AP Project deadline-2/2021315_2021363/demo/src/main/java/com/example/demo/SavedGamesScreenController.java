package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class SavedGamesScreenController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    //switch to a given game screen/ load a screen

    public void switchToGameScreen(ActionEvent event) throws IOException{
        Pane pane = FXMLLoader.load(getClass().getResource("Game-Screen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        Hero hero = new Hero();
        final Stick[] stick = {new Stick(5)};
        ArrayList<Pillar> pillars = new ArrayList<>();
        Random random = new Random();

        Pillar firstPillar = new Pillar(50, 0);
        pillars.add(firstPillar);

        int numOfPillars = random.nextInt(3) + 1;
        double lastPosX = 50;
        for (int i = 0; i < numOfPillars; i++) {
            double width = random.nextInt(66) + 20;
            double gap = random.nextInt(36) + 30;
            Pillar pillar = new Pillar(width, lastPosX + gap);
            pillars.add(pillar);
            lastPosX += gap + width;
        }

        Pillar lastPillar = new Pillar(20, 355);
        lastPillar.setColor(Color.WHITE);
        pillars.add(lastPillar);

        pane.getChildren().add(hero.getHero());
        pane.getChildren().add(stick[0].getStick());

        for (Pillar pillar : pillars) {
            pane.getChildren().add(pillar.getPillar());
        }

        Scene scene = new Scene(pane, 400, 400);
        final int[] f = {0};
        scene.setOnKeyPressed(key -> {
            switch (key.getCode()) {
                case UP:
                    if (f[0] == 0) {
                        stick[0].incLength();
                    }
                    break;
                case DOWN:
                    if (f[0] == 0) {
                        stick[0].decLength();
                    }
                    break;
                case ENTER:
                    if (f[0] == 0) {
                        stick[0].rotate();
                        f[0] = 1;
                    }
                    break;
                case SHIFT:
                    if (f[0] == 1) {
                        stick[0] = hero.moveHero(stick[0], pane, pillars);
                        f[0] = 0;
                    }
                default:
                    break;
            }
        });

        stage.setScene(scene);
        stage.show();
        scene.getRoot().requestFocus();
    }
}
