package com.miProyecto1;
/*
Put header here

 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.miProyecto1.Modelo.Usuario;

//import com.miVentana.MainApp;

//import com.miVentana.Modelo.Empleado;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Region;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

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
    public void btnIngresar(ActionEvent event) throws IOException, SQLException {
    	System.out.println("nombre :"+txtnombre.getText());
    	System.out.println("pass :"+txtpassword.getText());
    	Connection con = null;
    	ResultSet result = null;
    	
    	String url = "jdbc:sqlite:C:/Users/EDDY/Desktop/base.db";
		con = DriverManager.getConnection(url);
		DatabaseMetaData meta = con.getMetaData();
		System.out.println("Conexion exitosa usando  1: " + meta.getDriverName());
		
		String sql3 = "select * FROM usuario WHERE nomusuario = ? and password=?";
		PreparedStatement st2 = con.prepareStatement(sql3);
		st2.setString(1, txtnombre.getText());
		st2.setString(2, txtpassword.getText());
        result = st2.executeQuery();
		
    		while(result.next()) {
    			System.out.println("Se Logueo Correctamente!!!"); 
	    	try {
	    		Stage escenario = new Stage();
	    		FXMLLoader loader = loadFXML("pantalla2");
	    		Region raiz = (Region) loader.load();
	    		FXMLpantalla2Controller contro = loader.<FXMLpantalla2Controller>getController();
	    		
				Scene escena = new Scene(raiz);//Crear el archivo
				escenario.setScene(escena);
				escenario.setTitle("Segunda ventana");
				escenario.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}

    }
    
           
    private static FXMLLoader loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/"+fxml + ".fxml"));
        return fxmlLoader;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

	   
}
