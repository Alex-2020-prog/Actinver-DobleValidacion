package com.mx.actinver.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Fondo implements Serializable {

	private static final long serialVersionUID = -5038380242505111025L;
	
	private String tipoFondo;
	private String tipoCustodia;
	private String clavePizarra;
	private String operadora;
	private String tipoSocInv;
	private String moneda;
	private String codProducto;
	private String cajonIndeval;
	private String cajonIndevalFondo;
	private String contratoCustodio;
	private String contratoSocioLiq;
	private String indevalFondo;
	private String tipoValor;
	private String mercadoVarglobal;	
	private String valVarglobal;	

}
