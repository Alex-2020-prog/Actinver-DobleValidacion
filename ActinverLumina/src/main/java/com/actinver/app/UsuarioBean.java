package com.actinver.app;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class UsuarioBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nombre = "Don Alejo";
	private String apellido = "Del Wey!";
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
