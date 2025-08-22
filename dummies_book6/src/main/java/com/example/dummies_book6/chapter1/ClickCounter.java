package com.example.dummies_book6.chapter1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickCounter extends Application {
    Button btn;
    Label lbl;
    int iClickCount = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //set up button
        btn = new Button();
        btn.setText("Click me please");
        btn.setOnAction(e-> buttonClick());

        //set up lable
        lbl = new Label();
        lbl.setText("You have not clicked the button");

        //set up pain
        BorderPane pane = new BorderPane();
        pane.setTop(lbl);
        pane.setCenter(btn);

        //set up scene
        Scene scene = new Scene(pane, 250, 150);

        //Set up stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.show();

    }

    public void buttonClick() {
        iClickCount++;
        if (iClickCount == 1) {
            lbl.setText("You have clicked once.");
        } else {
            lbl.setText("You have clicked " + iClickCount + " times.");
        }
    }
}
