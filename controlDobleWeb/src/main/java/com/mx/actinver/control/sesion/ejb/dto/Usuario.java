package com.mx.actinver.control.sesion.ejb.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = -8361748378113316123L;
	private String usuario;
	private String contrasenia;
	private String nombre;
	private boolean ejecucionProcesos;

}
