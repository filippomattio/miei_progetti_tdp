package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;
private long inizio;
private long fine;
private long tot;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button buttonCancella;
    
    @FXML
    private TextArea txtTempo;

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	inizio = System.nanoTime();
    	this.elenco.addParola(this.txtParola.getText());
    	List<String> l = this.elenco.getElenco();
    	String s = "";
    	for(String ss:l) {
    		s = s + ss + "\n";
    	}
    	this.txtResult.setText(s);
    	this.txtParola.setText("");
    	fine = System.nanoTime();
        tot = fine-inizio;
    	this.txtTempo.setText(Long.toString(tot));
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	this.elenco.reset();
    	this.txtResult.setText("");
    }
    
    @FXML
    void toCancella(ActionEvent event) {
    	inizio = System.nanoTime();
String s = this.txtParola.getText();
this.elenco.cancella(s);
List<String> l = this.elenco.getElenco();
String q = "";
for(String ss:l) {
	q = q + ss + "\n";
}
this.txtResult.setText(q);
this.txtParola.setText("");
fine = System.nanoTime();
tot = fine-inizio;
this.txtTempo.setText(Long.toString(tot));
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
