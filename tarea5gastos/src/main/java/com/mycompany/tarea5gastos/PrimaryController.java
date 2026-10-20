package com.mycompany.tarea5gastos;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtAlim;
    @FXML private TextField txtRef;
    @FXML private TextField txtTrans;
    @FXML private TextField txtTel;
    @FXML private TextField txtOtros;
    
    @FXML private TextField txtTotal;
    @FXML private TextField txtMayor;

    @FXML
    private void calcular() {
        try {
            double alim = Double.parseDouble(txtAlim.getText().trim());
            double ref = Double.parseDouble(txtRef.getText().trim());
            double trans = Double.parseDouble(txtTrans.getText().trim());
            double tel = Double.parseDouble(txtTel.getText().trim());
            double otros = Double.parseDouble(txtOtros.getText().trim());
            
            double total = alim + ref + trans + tel + otros;
            txtTotal.setText(String.valueOf(total));
            
            double mayor = alim;
            String nombreMayor = "Alimentación";
            
            if (ref > mayor) {
                mayor = ref;
                nombreMayor = "Refrigerios";
            }
            if (trans > mayor) {
                mayor = trans;
                nombreMayor = "Transporte";
            }
            if (tel > mayor) {
                mayor = tel;
                nombreMayor = "Telefonía";
            }
            if (otros > mayor) {
                mayor = otros;
                nombreMayor = "Otros";
            }
            
            txtMayor.setText(nombreMayor);

        } catch (Exception e) {
            txtTotal.setText("Error");
        }
    }

    @FXML
    private void limpiar() {
        txtAlim.setText("");
        txtRef.setText("");
        txtTrans.setText("");
        txtTel.setText("");
        txtOtros.setText("");
        txtTotal.setText("");
        txtMayor.setText("");
    }
}