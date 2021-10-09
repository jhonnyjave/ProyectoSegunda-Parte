// proyecto segunda parte corriendo Jhonny J. V.
package com.miProyecto1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.miProyecto1.Modelo.Usuario;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLpantalla2Controller {
	   
	Connection con = null;
	
    @FXML
	private TextField txtNombreusuario;
    @FXML
	private TextField txtPassword;
    @FXML
	private TextField txtNombre;
    @FXML
	private TextField txtApellidos;
    @FXML
	private TextField txtDireccion;
    @FXML
	private TextField txtTelefono;
    @FXML
	private TextField txtid;
    @FXML
    private Label lblmensaje;
    
    @FXML
    private Label lbl123;
    
    @FXML
    private TextArea txtarea;
    
    @FXML
    private Label lblinsertar;
	

	
	@FXML
    public void btnRealizarregistro(ActionEvent event) throws SQLException {
		String url = "jdbc:sqlite:C:/Users/EDDY/Desktop/base.db";
		con = DriverManager.getConnection(url);
		DatabaseMetaData meta = con.getMetaData();
		System.out.println("Conexion exitosa usando  1: " + meta.getDriverName());
		
		String sql = "INSERT INTO usuario (nomusuario,password,nombre, apellidos,direccion,telefono) VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        //ps.setInt(1, 32);
        ps.setString(1, txtNombreusuario.getText());
        ps.setString(2, txtPassword.getText());
        ps.setString(3, txtNombre.getText());
        ps.setString(4, txtApellidos.getText());
        ps.setString(5, txtDireccion.getText());
        ps.setString(6, txtTelefono.getText());
        ps.executeUpdate();
        System.out.println("Insertado con éxito");
        lblinsertar.setText("Se Registro los datos correctamente!");	
	}
	
	@FXML
    public void btnEliminar(ActionEvent event) throws SQLException {
		
		String url = "jdbc:sqlite:C:/Users/EDDY/Desktop/base.db";
		con = DriverManager.getConnection(url);
		DatabaseMetaData meta = con.getMetaData();
		System.out.println("Conexion exitosa usando  1: " + meta.getDriverName());
		
		 String sql = "DELETE FROM usuario WHERE id = ?";

	        try (PreparedStatement ps = con.prepareStatement(sql)) {
	            ps.setInt(1, Integer.parseInt(txtid.getText()));
	            lblmensaje.setText("Se Elimino Correctamente!");
	            ps.executeUpdate();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
		
	}
	
	
	@FXML
	private void interactuarConDDBB(ActionEvent event) {	
		try {
			//Creará la base de datos miDDBB.db si no existe; caso contrario, se conecta
			String url = "jdbc:sqlite:C:/Users/EDDY/Desktop/base.db";
			con = DriverManager.getConnection(url);
			DatabaseMetaData meta = con.getMetaData();
			System.out.println("Conexion exitosa usando  1: " + meta.getDriverName());
			
			
			/*
			Statement st = con.createStatement();
			st.execute("CREATE TABLE usuario ("
					+ "id integer PRIMARY KEY,"
					+ "nomusuario text NOT NULL,"
					+ "password text NOT NULL,"
					+ "nombre text NOT NULL,"
					+ "apellidos text NOT NULL,"
					+ "direccion text NOT NULL,"
					+ "telefono text NOT NULL);");*/
			
			
		/*	String sql = "INSERT INTO usuario (nomusuario,password,nombre, apellidos,direccion,telefono) VALUES(?,?,?,?,?,?)";
	        PreparedStatement ps = con.prepareStatement(sql);
	        //ps.setInt(1, 32);
	        ps.setString(1, "admin");
	        ps.setString(2, "12345678");
	        ps.setString(3, "jhonny");
	        ps.setString(4, "jahuira velasquez");
	        ps.setString(5, "el alto");
	        ps.setString(6, "22807867");
	        ps.executeUpdate();
	        System.out.println("Insertado con éxito");
			*/
			
	       /* String sql2 = "INSERT INTO usuario (nomusuario,password,nombre, apellidos,direccion,telefono) VALUES(?,?,?,?,?,?)";
	        PreparedStatement ps2 = con.prepareStatement(sql2);
	        //ps.setInt(1, 32);
	        ps2.setString(1, "operador");
	        ps2.setString(2, "123");
	        ps2.setString(3, "carla");
	        ps2.setString(4, "jahuira velasquez");
	        ps2.setString(5, "el alto");
	        ps2.setString(6, "2233464");
	        ps2.executeUpdate();
	        System.out.println("Insertado con éxito");
	        
	        
	        String sql3 = "INSERT INTO usuario (nomusuario,password,nombre, apellidos,direccion,telefono) VALUES(?,?,?,?,?,?)";
	        PreparedStatement ps3 = con.prepareStatement(sql3);
	        //ps.setInt(1, 32);
	        ps3.setString(1, "usuario");
	        ps3.setString(2, "12345");
	        ps3.setString(3, "favian");
	        ps3.setString(4, "mamani quispe");
	        ps3.setString(5, "viacha");
	        ps3.setString(6, "6548769");
	        ps3.executeUpdate();
	        System.out.println("Insertado con éxito");
	        
	        String sql4 = "INSERT INTO usuario (nomusuario,password,nombre, apellidos,direccion,telefono) VALUES(?,?,?,?,?,?)";
	        PreparedStatement ps4 = con.prepareStatement(sql4);
	        //ps.setInt(1, 32);
	        ps4.setString(1, "usuario");
	        ps4.setString(2, "54321");
	        ps4.setString(3, "jose");
	        ps4.setString(4, "mamani quispe");
	        ps4.setString(5, "viacha");
	        ps4.setString(6, "71923456");
	        ps4.executeUpdate();
	        System.out.println("Insertado con éxito");
			
	        String sql5 = "INSERT INTO usuario (nomusuario,password,nombre, apellidos,direccion,telefono) VALUES(?,?,?,?,?,?)";
	        PreparedStatement ps5 = con.prepareStatement(sql5);
	        //ps.setInt(1, 32);
	        ps5.setString(1, "usuario");
	        ps5.setString(2, "12345");
	        ps5.setString(3, "manuel");
	        ps5.setString(4, "nuñez ordoñes");
	        ps5.setString(5, "la paz");
	        ps5.setString(6, "71923456");
	        ps5.executeUpdate();
	        System.out.println("Insertado con éxito");*/
	        
	        
	        
			
			String sql3 = "SELECT id, nomusuario, password, nombre, apellidos,direccion ,telefono FROM usuario where id > ?";
			PreparedStatement st2 = con.prepareStatement(sql3);
			st2.setInt(1, 0);//Ejemplo, id > 4
			ResultSet rs = st2.executeQuery();
			
		String resultado = "";
			while(rs.next()) {
				List<Usuario> listUser = new ArrayList<>();
				System.out.println(rs.getString("nomusuario") + ": " +
						rs.getInt("password"));
				Usuario ppp = new Usuario(rs.getInt("id"), rs.getString("nomusuario"), rs.getString("password"), rs.getString("apellidos"), 
						rs.getString("direccion"),rs.getString("telefono"), sql3);
				
				resultado = resultado+"\n"+ rs.getInt("id")+","+rs.getString("nomusuario")+","+rs.getString("password")+","+rs.getString("apellidos")+","+ 
						rs.getString("direccion")+","+rs.getString("telefono");
				
			}
			txtarea.setText(resultado+"");
			lbl123.setText("Se Listo Correctamente!");
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}	
}
