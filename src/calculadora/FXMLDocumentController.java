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
    
    @FXML
    private void sumar(ActionEvent event) {
        Double num1 = Double.parseDouble(this.fxnumero1.getText());
        Double num2 = Double.parseDouble(this.fxnumero2.getText());
        String suma = String.valueOf(num1+num2);
        this.fxresultado.setText(suma);
        this.fxhistorico.appendText(suma);
    }
    
    @FXML 
    private void porcentaje(ActionEvent event) {
        Double num1 = Double.parseDouble(this.fxnumero1.getText());
        Double num2 = Double.parseDouble(this.fxnumero2.getText());
        String porcentaje = String.valueOf(num1*(num2/100));
        this.fxresultado.setText(porcentaje);
    }
    
    @FXML
    private void elevar(ActionEvent event) {
        Double num1 = Double.parseDouble(this.fxnumero1.getText());
        Double num2 = Double.parseDouble(this.fxnumero2.getText());
        String elevar = String.valueOf(Math.pow(num1, num2));
        this.fxresultado.setText(elevar);
    }
    
    @FXML
    private void resto(ActionEvent event)  {
       Double num1 = Double.parseDouble(this.fxnumero1.getText());
       Double num2 = Double.parseDouble(this.fxnumero2.getText());
       String resto = String.valueOf(num1%num2);
       this.fxresultado.setText(resto); 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
