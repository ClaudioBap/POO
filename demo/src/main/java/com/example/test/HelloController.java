package com.example.test;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Locale;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText(texTest("Welcome "));
        welcomeText.setText(texTest("Welc"));
    }

    private String texTest(String message){
        return message + "to JavaFX Application!";
    }
}