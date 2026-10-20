package com.mycompany.tarea3cifras;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNum;
    @FXML private TextField txtCantCifras;
    @FXML private TextField txtSumaImpares;
    @FXML private TextField txtSumaPares;
    @FXML private TextField txtSumaTotal;
    @FXML private TextField txtMayor;
    @FXML private TextField txtMenor;
    @FXML private TextArea txtDivisores;

    @FXML
    private void analizar() {
        try {
            String strNum = txtNum.getText().trim();
            int num = Integer.parseInt(strNum);
            
            //PROCESAR CIFRAS 
            int cantCifras = strNum.length();
            int sumaPares = 0;
            int sumaImpares = 0;
            int sumaTotal = 0;
            
            int primerDigito = Character.getNumericValue(strNum.charAt(0));
            int mayor = primerDigito;
            int menor = primerDigito;

            for (int i = 0; i < strNum.length(); i++) {
                int digito = Character.getNumericValue(strNum.charAt(i));
                
                sumaTotal += digito;
                
                if (digito % 2 == 0) {
                    sumaPares += digito;
                } else {
                    sumaImpares += digito;
                }
                
                if (digito > mayor) mayor = digito;
                if (digito < menor) menor = digito;
            }

            // Mostrar resultados de cifras
            txtCantCifras.setText(String.valueOf(cantCifras));
            txtSumaImpares.setText(String.valueOf(sumaImpares));
            txtSumaPares.setText(String.valueOf(sumaPares));
            txtSumaTotal.setText(String.valueOf(sumaTotal));
            txtMayor.setText(String.valueOf(mayor));
            txtMenor.setText(String.valueOf(menor));

            //CALCULAR DIVISORES 
            StringBuilder sbDivisores = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    sbDivisores.append(i).append("\n");
                }
            }
            txtDivisores.setText(sbDivisores.toString());

        } catch (Exception e) {
            
        }
    }

    @FXML
    private void limpiar() {
        txtNum.setText("");
        txtCantCifras.setText("");
        txtSumaImpares.setText("");
        txtSumaPares.setText("");
        txtSumaTotal.setText("");
        txtMayor.setText("");
        txtMenor.setText("");
        txtDivisores.setText("");
    }
}
