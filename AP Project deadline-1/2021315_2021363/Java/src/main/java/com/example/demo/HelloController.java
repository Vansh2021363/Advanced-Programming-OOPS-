package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import java.io.Serializable;

import java.io.IOException;

public class HelloController implements Serializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMainScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Main-Menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToGameScreen(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Game-Screen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPauseScreen(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Pause-Screen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToGameOverScreen(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Game-Over-Screen.fxml"));
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