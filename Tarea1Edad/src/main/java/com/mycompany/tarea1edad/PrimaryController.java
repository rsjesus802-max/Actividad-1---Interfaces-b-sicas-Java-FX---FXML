package com.mycompany.tarea1edad;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtFecha;

    @FXML
    private Label txtRes;

    @FXML
    private void calcularEdad() {
        try {
            // 1. Obtenemos el texto ingresado
            String fechaTexto = txtFecha.getText();
            
            // 2. Cortamos por las diagonales "/"
            String[] partes = fechaTexto.split("/");
            int diaNac = Integer.parseInt(partes[0]);
            int mesNac = Integer.parseInt(partes[1]);
            int anioNac = Integer.parseInt(partes[2]);
            
            // 3. Fecha actual fijada
            int anioActual = 2026;
            int mesActual = 10;
            int diaActual = 19;
            
            // 4. Lógica de restas
            int anos = anioActual - anioNac;
            int meses = mesActual - mesNac;
            
            if (meses < 0) {
                anos--;
                meses = meses + 12;
            }
            
            if (meses == 0 && diaActual < diaNac) {
                anos--;
                meses = 11;
            }
            
            // 5. Resultado en pantalla
            txtRes.setText("Tiene " + anos + " años con " + meses + " meses");
            
        } catch (Exception e) {
            txtRes.setText("Error en el formato (usa dd/mm/aaaa)");
        }
    }

    @FXML
    private void limpiarCampos() {
        txtFecha.setText("");
        txtRes.setText("TU EDAD ES :");
    }
}