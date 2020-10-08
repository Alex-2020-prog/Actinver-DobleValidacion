package com.mx.actinver.service;

import java.util.ArrayList;
import java.util.List;

import com.mx.actinver.model.Contacto;

public class GestoraService {

	public List<String> tiposContacto() {
		List<String> lst = new ArrayList<>();
		lst.add("Fisico");
		lst.add("Moral");
		return lst;
	}

	public List<Contacto> getContactos() {
		List<Contacto> contactos = new ArrayList<>();
			Contacto c1 = new Contacto("Fisico", "López", "Hugo", "XXXXXX", "Yucatan", "55-3210-1230");
			Contacto c2 = new Contacto("Moral", "López", "Paco", "XXXXXX", "Oaxaca", "55-3210-1230");
			Contacto c3 = new Contacto("Matemático", "López", "Luis", "XXXXXX", "CDMX", "55-3210-1230");
			
			contactos.add(c1);
			contactos.add(c2);
			contactos.add(c3);
		return contactos;
	}
}
