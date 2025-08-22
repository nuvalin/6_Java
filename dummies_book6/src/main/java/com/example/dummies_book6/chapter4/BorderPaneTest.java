package com.example.dummies_book6.chapter4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button One");
        Button btn2 = new Button("Button Two");
        Button btn3 = new Button("Button Three");
        VBox vbox = new VBox(btn1, btn2, btn3);



        BorderPane bpane = new BorderPane();
        bpane.setCenter(vbox);
        bpane.setBottom(vbox);
        bpane.setTop(vbox);

        Scene scene = new Scene(bpane,500,500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Testing Flow pane");
        primaryStage.show();


    }
}
