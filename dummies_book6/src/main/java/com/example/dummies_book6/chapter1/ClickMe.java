package com.example.dummies_book6.chapter1;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
public class ClickMe extends Application
{
    public static void main(String[] args) {
        System.out.println("Launching");
        launch(args);
        System.out.println("Finishing");
    }
    Button btn;
    @Override public void start(Stage primaryStage) {
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e ->buttonClick());


        //add button to layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);


        //create a scene
        Scene scene = new Scene(pane,300, 250);

        //put scene on stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Click App");
        primaryStage.show();
    }




    public void buttonClick() {
        if (btn.getText() == "Click me please!") {
            btn.setText("You clicked me!");
        }else {
        }
    }
    }