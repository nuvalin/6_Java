package com.example.dummies_book6.chapter4;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class GridPaneTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label lblName = new Label("Name");
        GridPane grid = new GridPane();
        grid.add(lblName,5,6);


    }
}
