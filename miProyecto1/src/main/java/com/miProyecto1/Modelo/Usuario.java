package com.miProyecto1.Modelo;

import java.io.Serializable;

public class Usuario implements Serializable{
	public int id;
	public String nomusuario;
	public String password;
	public String nombre;
	public String apellidos;
	public String direccion;
	public String telefono;
	
	
	public Usuario(Integer id, String nomusuario, String password, String nombre, String apellidos, String direccion,
			String telefono) {
		super();
		this.id = id;
		this.nomusuario = nomusuario;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
	}




}
