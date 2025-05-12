package com.example.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controlador {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Demetrio es un tio guay");
    }
}