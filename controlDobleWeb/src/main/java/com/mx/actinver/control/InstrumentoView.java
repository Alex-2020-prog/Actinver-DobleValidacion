package com.mx.actinver.control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import com.mx.actinver.model.Instrumento;
import com.mx.actinver.service.InstrumentoService;


@ManagedBean(name="dtInstRowView")
public class InstrumentoView {

	private List<Instrumento> instrumentos = new ArrayList<>();
	
	private InstrumentoService service = new InstrumentoService();
	
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
