package com.mx.actinver.service;

import java.util.ArrayList;
import java.util.List;

import com.mx.actinver.model.Conciliacion;

public class ConciliacionService {

	public List<Conciliacion> createDataDummy() {
		List<Conciliacion> lst = new ArrayList<>();
		Conciliacion cn = new Conciliacion();
		
		cn.setFondo("Fondo: ACTIVR00");
		cn.setEmisora("Emisora: Actinver");
		cn.setSerie("Serie: AA");
		cn.setTipoValor("Tipo Valor:52");
		cn.setValorNominal("Valor Nominal:100.00");
		cn.setMoneda("Moneda:MX");
		lst.add(cn);
		
		return lst;
	}

}
