package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToGameScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Game-Screen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public void switchToSavedGamesScreen(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Saved-Games-Screen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void exitgame(ActionEvent event) throws IOException{
        javafx.application.Platform.exit();
    }
}
