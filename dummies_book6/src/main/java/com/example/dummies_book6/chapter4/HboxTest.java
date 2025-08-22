package com.example.dummies_book6.chapter4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class HboxTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button One");
        Button btn2 = new Button("Button Two");
        Button btn3 = new Button("Button Three");

        //pane
       // HBox hbox = new HBox(btn1, btn2, btn3);

        //HBox hbox = new HBox(10, btn1, btn2, btn3);



// Create the spacer
        Region spacer = new Region();
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(20,10,20,10));
        //hbox.setSpacing(10);
        HBox.setHgrow(spacer, Priority.ALWAYS);
        hbox.getChildren().addAll(btn1,btn2,spacer,btn3);
        hbox.setMargin(btn1, new Insets(10));
        hbox.setMargin(btn2, new Insets(10));
        hbox.setMargin(btn3, new Insets(10));
        //Hbox.setSpacing(10);
       // HBox hbox = new HBox(10);

        //scene
        Scene scene = new Scene(hbox,750,750);
        //stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("TESTING HBOX");
        primaryStage.show();


    }
}
