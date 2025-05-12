package com.example.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controlador {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField input1;
    @FXML
    private TextField input2;
    @FXML
    private Label resultado;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Demetrio es un tio guay");
    }
    @FXML
    protected void sumarButtonClick() {
        try {
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());
            double suma = num1 + num2;
            resultado.setText("El resultado es: " + suma);
        } catch (NumberFormatException e) {
            resultado.setText("El numero no es valido");
        }
    }
}