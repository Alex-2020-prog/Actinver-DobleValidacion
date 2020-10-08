package com.mx.actinver.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.mx.actinver.model.Liquidacion;


@Named
@ApplicationScoped
public class LiquidacionService {

	private final static String[] colors;

	private final static String[] brands;

	static {
		colors = new String[10];
		colors[0] = "Black";
		colors[1] = "White";
		colors[2] = "Green";
		colors[3] = "Red";
		colors[4] = "Blue";
		colors[5] = "Orange";
		colors[6] = "Silver";
		colors[7] = "Yellow";
		colors[8] = "Brown";
		colors[9] = "Maroon";

		brands = new String[10];
		brands[0] = "BMW";
		brands[1] = "Mercedes";
		brands[2] = "Volvo";
		brands[3] = "Audi";
		brands[4] = "Renault";
		brands[5] = "Fiat";
		brands[6] = "Volkswagen";
		brands[7] = "Honda";
		brands[8] = "Jaguar";
		brands[9] = "Ford";
	}

	public static String[] getColors() {
		return colors;
	}

	public static String[] getBrands() {
		return brands;
	}

	public List<Liquidacion> createLiquidacion() {
		List<Liquidacion> list = new ArrayList<>();
		Liquidacion liq = new Liquidacion();
		liq.setId("A321");
		liq.setCash("cheque");
		liq.setMethod("Transferencia");
		liq.setPay("liquidacion");
		liq.setPreferred("preferred");
		liq.setRol("maker");
		list.add(liq);
		return list;
	}

}
