package com.example.dummies_book6.chapter4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button One");
        Button btn2 = new Button("Button Two");
        Button btn3 = new Button("Button Three");
        btn1.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxWidth(Double.MAX_VALUE);
       // VBox vbox = new VBox(btn1, btn2, btn3);

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(btn1, btn2, btn3);
        Scene scene = new Scene(vbox,750,750);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);


        //Scene scene = new Scene(vbox,750,750);

        primaryStage.setScene(scene);
        primaryStage.setTitle("VBox testing");
        primaryStage.show();




    }
}
