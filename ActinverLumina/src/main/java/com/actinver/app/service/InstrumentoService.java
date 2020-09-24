package com.actinver.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.actinver.app.model.Instrumento;

@Named
@ApplicationScoped
public class InstrumentoService {
	
	public List<Instrumento> createInstrumentos(){
		List<Instrumento> lst = new ArrayList<>();

		Instrumento inst = new Instrumento();
		inst.setTipo("Fondo de Inversi�n");
		inst.setNombre("ACTDUAL");
		inst.setDescripcion("Combinaci�n �ptima deuda d�lares y pesos");
		inst.setEstatus("Valores Checker");
		inst.setDias(2);
		lst.add(inst);
		
		Instrumento inst1 = new Instrumento();
		inst1.setTipo("Fondo de Inversi�n");
		inst1.setNombre("ACTIPLU");
		inst1.setDescripcion("Inversi�n de largo plazo");
		inst1.setEstatus("Distribuci�n Maker");
		inst1.setDias(3);
		lst.add(inst1);
		
		Instrumento inst2 = new Instrumento();
		inst2.setTipo("Fondo de Inversi�n");
		inst2.setNombre("SALUD");
		inst2.setDescripcion("Portafolio de Empresas del Sector Salud");
		inst2.setEstatus("Gestoria Maker");
		inst2.setDias(4);
		lst.add(inst2);
		return lst;
	}
	
}
