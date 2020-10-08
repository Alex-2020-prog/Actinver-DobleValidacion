package com.mx.actinver.control.sesion.ejb;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.mx.actinver.control.sesion.ejb.dto.Usuario;

public class Sesion implements Serializable {
	
	private static final long serialVersionUID = 1600811380212814656L;

	private static HttpSession getSession() {
        return (HttpSession)
        		FacesContext.
        		getCurrentInstance().
        		getExternalContext().
        		getSession(false);
	}
	
	public static boolean isActive() {
		return (getSession() != null ? true : false);
	}
	
	public static Usuario getUsuario() {
		try
  		{
  		  HttpSession session = getSession();
  	        if ( session != null )
  	        	return ((Usuario) session.getAttribute("usuario") != null ? (Usuario) session.getAttribute("usuario") : new Usuario());
  	        else
  	            return null;
  		}catch(Exception ex)
  		{
  			ex.printStackTrace();
  			return null;
  		}
	}
	
	public static void setUsuario(Usuario usuario) {
		try
  		{
			getSession().setAttribute("usuario", usuario);
  		}catch(Exception ex)
  		{
  			ex.printStackTrace();
  		}
	}
	
	public static boolean getConectado() {
		try
  		{
  		  HttpSession session = getSession();
  	        if ( session != null )
  	            return ((Boolean)session.getAttribute("conectado") != null ? (Boolean)session.getAttribute("conectado") : false);
  	        else
  	            return false;
  		}catch(Exception ex)
  		{
  			ex.printStackTrace();
  			return false;
  		}
	}
	
	public static void setConectado(boolean conectado) {
		try
  		{
			getSession().setAttribute("conectado", conectado);
				
  		}catch(Exception ex)
  		{
  			ex.printStackTrace();
  		}
	}
	
	public static void close() {
		
		try	{
			
			getSession().removeAttribute("conectado");
			getSession().removeAttribute("usuario");
			getSession().invalidate();
	  	
		} catch(Exception ex) {
	  		ex.printStackTrace();
	  	}
	}

}
