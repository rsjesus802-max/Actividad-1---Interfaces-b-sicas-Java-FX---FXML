package com.mycompany.tarea4tabla;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNum;
    @FXML private TextArea txtResultado;

    @FXML
    private void calcularTabla() {
        try {
            int n = Integer.parseInt(txtNum.getText().trim());
            String resultado = "";
            
            for (int i = 1; i <= 10; i++) {
                resultado += n + " x " + i + " = " + (n * i) + "\n";
            }
            
            txtResultado.setText(resultado);
        } catch (Exception e) {
            txtResultado.setText("Error");
        }
    }

    @FXML
    private void limpiar() {
        txtNum.setText("");
        txtResultado.setText("");
    }
}