package com.mycompany.tarea2dinero;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDin;

    @FXML
    private TextArea txtBill;

    @FXML
    private TextArea txtCant;

    @FXML
    private void desglosarDinero() {
        try {
            int total = Integer.parseInt(txtDin.getText());
            
            int b500 = total / 500; total %= 500;
            int b200 = total / 200; total %= 200;
            int b100 = total / 100; total %= 100;
            int b50  = total / 50;  total %= 50;
            int b20  = total / 20;  total %= 20;
            int m10  = total / 10;  total %= 10;
            int m5   = total / 5;   total %= 5;
            int m2   = total / 2;   total %= 2;
            int m1   = total;
            
            /// Las denominaciones van en txtBill (la caja de la izquierda)
        txtBill.setText("Billetes de $500\n" +
                "Billetes de $200\n" +
                "Billetes de $100\n" +
                "Billetes de $50\n" +
                "Billetes de $20\n" +
                "Monedas de $10\n" +
                "Monedas de $5\n" +
                "Monedas de $2\n" +
                "Monedas de $1");

            // Las cantidades numéricas van en txtCant (la caja de la derecha)
            txtCant.setText(b500 + "\n" +
                b200 + "\n" +
                b100 + "\n" +
                b50  + "\n" +
                b20  + "\n" +
                m10  + "\n" +
                m5   + "\n" +
                m2   + "\n" +
                m1);
            
        } catch (Exception e) {
            txtCant.setText("Error");
        }
    }

    @FXML
    private void limpiarCampos() {
        txtDin.setText("");
        txtBill.setText("");
        txtCant.setText("");
    }
}