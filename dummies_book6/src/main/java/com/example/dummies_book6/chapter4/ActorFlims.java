package com.example.dummies_book6.chapter4;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ActorFlims extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    TextField intNoOfFlims;
    TextField txtActor;

    @Override
    public void start(Stage primaryStage) {
        // Create the Character
        Label lblNoOfFlims = new Label("Character's Name:");
        lblNoOfFlims.setMinWidth(100);
        lblNoOfFlims.setAlignment(Pos.BOTTOM_RIGHT);

        // Create the Character input text field
        intNoOfFlims = new TextField();
        intNoOfFlims.setMinWidth(200);
        intNoOfFlims.setMaxWidth(200);
        intNoOfFlims.setPromptText(
                "Enter the name of the character here.");

        // Create the Actor label
        Label lblActor = new Label("Actor's Name:");
        lblActor.setMinWidth(100);
        lblActor.setAlignment(Pos.BOTTOM_RIGHT);

        // Create the Actor text field
        txtActor = new TextField();
        txtActor.setMinWidth(200);
        txtActor.setMaxWidth(200);
        txtActor.setPromptText("Enter the name of the actor here.");

        // Create the OK button
        Button btnOK = new Button("OK");
        btnOK.setMinWidth(75);
        btnOK.setOnAction(e -> btnOK_Click());

        // Create the Character pane
        HBox paneCharacter = new HBox(20, lblNoOfFlims, intNoOfFlims);
        paneCharacter.setPadding(new Insets(10));

        // Create the Actor pane
        HBox paneActor = new HBox(20, lblActor, txtActor);
        paneActor.setPadding(new Insets(10));

        // Create the Button pane
        HBox paneButton = new HBox(20, btnOK);
        paneButton.setPadding(new Insets(10));
        paneButton.setAlignment(Pos.BOTTOM_RIGHT);
        // Add the Character, Actor, and Button panes to a VBox
        VBox pane = new VBox(10, paneCharacter, paneActor, paneButton);
        // Set the stage
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Role Player");
        primaryStage.show();
    }

    public void btnOK_Click() {
        String errorMessage = "";
        if (intNoOfFlims.getText().length() == 0) {
            errorMessage += "\nCharacter is a required field.";
        }
        if (isInt(intNoOfFlims ,  "You must enter an integer")) {

        }
        if (txtActor.getText().length() == 0) {
            errorMessage += "\nActor is a required field.";
        }


        if (errorMessage.length() == 0) {
            String message = "The role of " + intNoOfFlims.getText()
                    + " will be played by "
                    + txtActor.getText()
                    + ".";
            Alert a = new Alert(Alert.AlertType.INFORMATION, message);
            a.setTitle("Cast");
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.WARNING, errorMessage);
            a.setTitle("Missing Data");
            a.showAndWait();
        }
    }

    private boolean isInt(TextField f, String msg) {
        try {
            Integer.parseInt(f.getText());
            return true;
        }catch (NumberFormatException e) {
            Alert a = new Alert(Alert.AlertType.WARNING,msg);
            a.setTitle("Invalid Data");
            a.showAndWait();
            return false;
        }
    }
}