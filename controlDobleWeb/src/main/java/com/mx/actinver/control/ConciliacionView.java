package com.mx.actinver.control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import com.mx.actinver.model.Conciliacion;
import com.mx.actinver.service.ConciliacionService;

@ManagedBean(name="dtConciliacion")
public class ConciliacionView {

	private List<Conciliacion> lst = new ArrayList<>();
	private Conciliacion conciliacion;
	
	private ConciliacionService service = new ConciliacionService();
	
	@PostConstruct
	public void init() {
		lst = service.createDataDummy();
		conciliacion = lst.get(0);
	}

	public Conciliacion getConciliacion() {
		return conciliacion;
	}

	public void setConciliacion(Conciliacion conciliacion) {
		this.conciliacion = conciliacion;
	}

}
