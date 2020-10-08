package com.mx.actinver.control.sesion.ejb;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import com.mx.actinver.control.sesion.ejb.dto.Usuario;

@ManagedBean(name="login")
//@SessionScoped
public class LoginBean implements Serializable {
	
	private static final long serialVersionUID = 8523775205897382602L;
	private Usuario usr;
	private String vista;
	
	@PostConstruct
	public void init() 
	{
		usr = new Usuario();
	}

	public String autenticar() {
		
		try 
		{
			if(!Sesion.getConectado())
			{
		
				//TODO Sustituir por una consulta a la DB o LDAP
				boolean autenticado = true;
				
				if( autenticado ) {
					
					if(usr.getUsuario().equalsIgnoreCase("Admin")) 
						vista = "/fondos/administracion/propiedadesGenerales.xhtml";
					else if(usr.getUsuario().equalsIgnoreCase("Maker")) 
						vista = "/fondos/maker/valoresM.xhtml";
					else if(usr.getUsuario().equalsIgnoreCase("Checker")) 
						vista = "/fondos/checker/valoresCEdit.xhtml";
					else
						vista = "index.sp";

					return vista;
					
				} else {
					return "fallo";
				}
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return "fallo";
		
	}

	public Usuario getUsr() {
		return usr;
	}

	public void setUsr(Usuario usr) {
		this.usr = usr;
	}

	public String getVista() {
		return vista;
	}

	public void setVista(String vista) {
		this.vista = vista;
	}
	
}
