package com.mx.actinver.control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import lombok.Data;

@ManagedBean(name="distribucionMaker")
//@SessionScoped
@Data
public class DistribucionMaker implements Serializable {
	
	private static final long serialVersionUID = 273865760044190435L;
	
	private String distribucionFondo;
	private String clavePizarra;
	private String operadora;
	private String tipoSocInversion;
	private String moneda;
	private String perfilInversion;
	private String compraCantidad;
	private String compraMonto;
	private String ventaCantidad;
	private String ventaMonto;
	private String fondoPension;
	private String calendarios;
	private String plan176;
	private String plan218;
	private String fonXCon;
	private String fonDeCon;
	private String permanencia;
	private String importeMin;
	private String fuentePrecio;
	private String accionesCantidadAutorizada;
	private String accionesValorNominal;
	private String factorRecompra;
	private String tipoFactorRecompra;
	private String deltaRecompra;
	private String maxInversionContrato;
	private String stockMinimo;
	private String tipoAlarma;
	private String certificacion;
	private String nombreClase;
	private String series;
	private String nombreSeries;
	private String montoMinimo;
	private String montoMaximo;
	private String seriePrimeraInversion;
	private String serieFija;
	private String cuentas;
	private String cartera;
	private String proveedora;
	private String seccFormOperaLiquidacion;
	private String compraAnticipa;
	private String compraOpera;
	private String compraLiquida;
	private String ventaAnticipa;
	private String ventaOpera;
	private String ventaLiquida;
	private String parametrosEspeciales;
	private String procesoEsp;
	private String rebalanceos;
	private String permiteReb;
	private String porLibreFondoDestino;
	private String porCompraRebalanceo;
	private String liquidacionIndeval;
	private String ctaActinver;
	private String ctaIndeval;
	private String fondoEspecial;
	
	
	
	public List<String> getDistribucionFondo(String query) {
        List<String> results = new ArrayList<>();
        results.add("Banco");
        results.add("Casa de Bolsa");
        results.add("Ambos");
        results.add("Ninguno");
         
        return results;
    }
	
	public List<String> getLstOperadora(String query) {
        List<String> results = new ArrayList<>();
        results.add("Actinver");
        results.add("Todas las Demas");
         
        return results;
    }
	
	public List<String> getLstTipoSocInversion(String query) {
        List<String> results = new ArrayList<>();
        results.add("Deuda");
        results.add("Renta Variable");
        results.add("Cobertura");
         
        return results;
    }
	
	public List<String> getLstMoneda(String query) {
        List<String> results = new ArrayList<>();
        results.add("MX");
        results.add("USD");
         
        return results;
    }
	
	public List<String> getLstPerfilInversion(String query) {
        List<String> results = new ArrayList<>();
        results.add("Activo");
        results.add("Uno");
         
        return results;
    }
	
	public List<String> getLstCalendarios(String query) {
        List<String> results = new ArrayList<>();
        results.add("MX_UTC");
        results.add("USA_TM");
         
        return results;
    }
	

}
