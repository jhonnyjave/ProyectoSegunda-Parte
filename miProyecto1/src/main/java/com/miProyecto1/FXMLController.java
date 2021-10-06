package com.miProyecto1;
/*
Put header here

 */
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

import javafx.stage.FileChooser;

public class FXMLController implements Initializable {
	
	final String nom = "jhonny";
	final String pass = "12345678";
	   
    @FXML
    private Label lblOut;
    
    @FXML
	private TextField txtnombre;
    
    @FXML
  	private TextField txtpassword;
    
    @FXML
  	private Label lblmensaje;
    
    @FXML
    public void btnIngresar(ActionEvent event) {
    	if(txtnombre.getText().equals(nom) && txtpassword.getText().equals(pass)) {
    		lblmensaje.setText("Datos correctos");	  
    		 try {
	    	    		Stage escenario = new Stage();
	    	    		Scene escena = new Scene(loadFXML("pantalla2"));
	    	    		escenario.setScene(escena);
	    				escenario.setTitle("Segunda ventana");
	    				escenario.show();
    			  }
    			catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			} 
    	  }
          		
          else {
          	lblmensaje.setText("Debe llenar los datos correctos, vuelva a intentar.");
          }
    }
    
           
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/"+fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

	   
}
