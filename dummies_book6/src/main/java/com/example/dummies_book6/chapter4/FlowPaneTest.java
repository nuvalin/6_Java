package com.example.dummies_book6.chapter4;

import javafx.application.Application;
//import javafx.geometry.Orientation;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import static javax.swing.text.StyleConstants.Orientation;

public class FlowPaneTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button one");
        Button btn2 = new Button("Button two");
        Button btn3 = new Button("Button three");
        Button btn4 = new Button("Button four");
        Button btn5 = new Button("Button Five");
        FlowPane fpane = new FlowPane(javafx.geometry.Orientation.VERTICAL, 10, 10, btn1, btn2, btn3, btn4, btn5);
        fpane.setPrefWrapLength(300);

        Scene scene = new Scene(fpane,200,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Testing Flow pane");
        primaryStage.show();



    }
}
