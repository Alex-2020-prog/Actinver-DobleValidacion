package com.mx.actinver.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Contacto implements Serializable {

	private static final long serialVersionUID = 6440798129315060069L;
	
	private Integer id;
	private String tipoContacto;
	private String apellido;
	private String nombre;
	private String direccion;
	private String ciudad;
	private String telefono;
	
	public Contacto() {
		super();
	}
	
	public Contacto(String tipoContacto, String apellido, String nombre, String direccion, String ciudad,
			String telefono) {
		super();
		this.tipoContacto = tipoContacto;
		this.apellido = apellido;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.telefono = telefono;
	}

	
}
