package com.mx.actinver.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

import com.mx.actinver.model.Instrumento;

@Named
@ApplicationScoped
public class InstrumentoService {
	
	public List<Instrumento> createInstrumentos(){
		List<Instrumento> lst = new ArrayList<>();

		Instrumento inst = new Instrumento();
		inst.setTipo("Fondo de Inversión");
		inst.setNombre("ACTDUAL");
		inst.setDescripcion("Combinación óptima deuda dólares y pesos");
		inst.setEstatus("Valores Checker");
		inst.setDias(2);
		inst.setLink("/fondos/checker/valoresCEdit");
		lst.add(inst);
		
		Instrumento inst1 = new Instrumento();
		inst1.setTipo("Fondo de Inversión");
		inst1.setNombre("ACTIPLU");
		inst1.setDescripcion("Inversión de largo plazo");
		inst1.setEstatus("Distribución Maker");
		inst1.setDias(3);
		inst1.setLink("/fondos/maker/distribuidoraM");
		lst.add(inst1);
		
		Instrumento inst2 = new Instrumento();
		inst2.setTipo("Fondo de Inversión");
		inst2.setNombre("SALUD");
		inst2.setDescripcion("Portafolio de Empresas del Sector Salud");
		inst2.setEstatus("Gestoria Maker");
		inst2.setDias(4);
		inst2.setLink("/fondos/maker/contratos");
		inst2.setEscala("Llegó a su límite de tiempo en el flujo de Gestora");
		lst.add(inst2);
		return lst;
	}
	
}
