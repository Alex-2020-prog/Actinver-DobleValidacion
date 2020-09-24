package com.actinver.app.controler;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.actinver.app.model.Instrumento;
import com.actinver.app.service.InstrumentoService;

@Named("dtInstRowView")
@ViewScoped
public class InstrumentoView {

	private List<Instrumento> instrumentos = new ArrayList<>();
	
	@Inject
	private InstrumentoService service;
	
	@PostConstruct
	public void init() {
		instrumentos = service.createInstrumentos();
	}

	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setService(InstrumentoService service) {
		this.service = service;
	}
	
}
