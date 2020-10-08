package com.mx.actinver.model;

import java.io.Serializable;

public class Conciliacion implements Serializable {

	private static final long serialVersionUID = 5478778248386033732L;
	
	private String fondo;
	private String emisora;
	private String serie;
	private String tipoValor;
	private String valorNominal;
	private String moneda;
	public String getFondo() {
		return fondo;
	}
	public void setFondo(String fondo) {
		this.fondo = fondo;
	}
	public String getEmisora() {
		return emisora;
	}
	public void setEmisora(String emisora) {
		this.emisora = emisora;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getTipoValor() {
		return tipoValor;
	}
	public void setTipoValor(String tipoValor) {
		this.tipoValor = tipoValor;
	}
	public String getValorNominal() {
		return valorNominal;
	}
	public void setValorNominal(String valorNominal) {
		this.valorNominal = valorNominal;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
}
