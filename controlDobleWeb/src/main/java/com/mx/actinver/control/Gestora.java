package com.mx.actinver.control;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.mx.actinver.model.Contacto;
import com.mx.actinver.model.Fondo;
import com.mx.actinver.service.GestoraService;

import lombok.Data;

@Data
@ManagedBean(name = "dtGestora")
@ApplicationScoped
public class Gestora {
	private Fondo fondo = new Fondo();
	private List<Contacto> contactos = null;
	private Contacto contacto = new Contacto();
	private GestoraService service = new GestoraService();
	private String imgStep="/controlDobleWeb/resources/images/altaFondo/AA-ContratosMaker.JPG";

	@PostConstruct
	private void ini() {
		contactos = service.getContactos();
	}

	public List<String> getTipos() {
		return service.tiposContacto();
	}

	public void guardar() {
		this.imgStep = "/controlDobleWeb/resources/images/altaFondo/AB-ContratosChk.JPG";
	}
}
