/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author daw
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField fxnumero1;
    @FXML
    private TextField fxnumero2;
    @FXML
    private Button fxsumar;
    @FXML
    private Button fxporcentaje;
    @FXML
    private Button fxelevar;
    @FXML
    private TextField fxresultado;
    @FXML
    private TextArea fxhistorico;
    @FXML
    private Label label;
    @FXML
    private Button fxresto;
    private static int contador;
    @FXML
    private Button fxlimpiar;

    @FXML
    private void sumar(ActionEvent event) {
        try {
            Double num1 = Double.parseDouble(this.fxnumero1.getText());
            Double num2 = Double.parseDouble(this.fxnumero2.getText());
            String suma = String.valueOf(num1 + num2);
            this.fxresultado.setText(suma);
            this.contador++;
            this.fxhistorico.appendText("Operacion " + contador + " -- La suma de " + num1 + " + " + suma + " = " + suma + "\n");
        } catch (NumberFormatException e) {
            this.fxresultado.setText("DATOS NO VÁLIDOS");
        }
    }

    @FXML
    private void porcentaje(ActionEvent event) {
        try {
            Double num1 = Double.parseDouble(this.fxnumero1.getText());
            Double num2 = Double.parseDouble(this.fxnumero2.getText());
            String porcentaje = String.valueOf(num1 * (num2 / 100));
            this.fxresultado.setText(porcentaje);
            contador++;
            this.fxhistorico.appendText("Operacion " + contador + " -- El " + num2 + "% de " + num1 + " = " + porcentaje + "\n");
        } catch (NumberFormatException e) {
            this.fxresultado.setText("DATOS NO VÁLIDOS");
        }
    }

    @FXML
    private void elevar(ActionEvent event) {
        try {
            Double num1 = Double.parseDouble(this.fxnumero1.getText());
            Double num2 = Double.parseDouble(this.fxnumero2.getText());
            String elevar = String.valueOf(Math.pow(num1, num2));
            this.fxresultado.setText(elevar);
            contador++;
            this.fxhistorico.appendText("Operacion " + contador + " -- " + num2 + " elevado a " + num1 + " = " + elevar + "\n");
        } catch (NumberFormatException e) {
            this.fxresultado.setText("DATOS NO VÁLIDOS");
        }
    }

    @FXML
    private void resto(ActionEvent event) {
        try {
            Double num1 = Double.parseDouble(this.fxnumero1.getText());
            Double num2 = Double.parseDouble(this.fxnumero2.getText());
            if (num2 == 0) {
                this.fxresultado.setText("ERROR");
            } else {
                String resto = String.valueOf(num1 % num2);
                this.fxresultado.setText(resto);
                contador++;
                this.fxhistorico.appendText("Operacion " + contador + " -- El resto de dividir " + num1 + " / " + num2 + " = " + resto + "\n");
            }
        } catch (NumberFormatException e) {
            this.fxresultado.setText("DATOS NO VÁLIDOS");
        }
    }

    @FXML
    private void limpiar(ActionEvent event) {
        this.fxnumero1.setText(null);
        this.fxnumero2.setText(null);
        this.fxresultado.setText(null);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
