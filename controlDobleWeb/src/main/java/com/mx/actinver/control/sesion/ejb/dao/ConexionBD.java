package com.mx.actinver.control.sesion.ejb.dao;

import java.io.Serializable;
import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.mx.actinver.control.util.Catalogo;

public class ConexionBD implements Serializable {
	
	private static final long serialVersionUID = -785510038459534723L;

	public Connection getConexionGESTOR() 
	{
		try 
		{
			InitialContext context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup(Catalogo.TipoConexion.CONTROL.getTipo());
			return dataSource.getConnection();
		}
		catch (Exception ex) 
		{
			ex.printStackTrace();
			return null;
		}
	}

}
