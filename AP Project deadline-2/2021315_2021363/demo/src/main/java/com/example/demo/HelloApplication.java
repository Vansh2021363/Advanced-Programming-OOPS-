package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Main-Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("AP_Project");
        stage.setWidth(400);
        stage.setHeight(400);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
        Stick stick = new Stick(1,2);
    }
}