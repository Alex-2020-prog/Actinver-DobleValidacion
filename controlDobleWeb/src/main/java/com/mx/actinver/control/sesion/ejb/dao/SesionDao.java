package com.mx.actinver.control.sesion.ejb.dao;

import java.io.Serializable;


public class SesionDao implements Serializable {

	private static final long serialVersionUID = -2632867085001141837L;
	
	public SesionDao() {
		
		new ConexionBD().getConexionGESTOR();
		
	}

}
