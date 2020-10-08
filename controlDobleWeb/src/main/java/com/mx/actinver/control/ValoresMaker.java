package com.mx.actinver.control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import lombok.Data;

@ManagedBean(name="valoresMaker")
//@SessionScoped
@Data
public class ValoresMaker implements Serializable {

	private static final long serialVersionUID = -2366208324159305610L;
	
	private String tipoDistribucionFondo;
	private String tipoInstrumento;
	private String tipoCustodia;
	private String denominacionSocial;
	private String clavePizarra;
	private String claveISIN;
	private String operadora;
	private Date fechaAltaFondo;
	private String moneda;
	private String tipoSocInversion;
	private Date horarioAperturaFondoCompraOperadora;
	private Date horarioCierreFondoCompraOperadora;
	private Date horarioAperturaFondoVentaOperadora;
	private Date horarioCierreFondoVentaOperadora;
	private String horizonteInversion;
	private String calRiesgoMercado;
	private String calRiesgoCredito;
	private Date fondoEjecucion;
	private Date dia;
	private Date fondoLiquidacion;
	private String mntMinInversion;
	private String plazoMinPermanencia;
	private String porcentajeMaxTenencia;
	
	
	private String nombreClase;
	private String numSeries;
	private String tipPerOperarClase;
	private String comClienteIncumpMinPermanencia;
	private String comClienteIncumpMinInversion;
	private String comClienteCompraAcciones;
	private String comClienteVentaAcciones;
	private String comClienteServicioAsesoria;
	private String comClienteServicioAdmAcciones;
	private String comFondoAdmActivos;
	private String comFondoOtras;
	
	
	
	public List<String> getTipoDistribucionFondo(String query) {
        List<String> results = new ArrayList<>();
        results.add("Fondo Propio");
        results.add("Fondo Externo");
         
        return results;
    }
	
	public List<String> getTipoInstrumento(String query) {
        List<String> results = new ArrayList<>();
        results.add("Fondo de Inversión");
        results.add("Mercado de Dinero");
         
        return results;
    }
	
	public List<String> getLstTipoCustodia(String query) {
        List<String> results = new ArrayList<>();
        results.add("Propia");
        results.add("Externa");
         
        return results;
    }
	
	public List<String> getLstOperadora(String query) {
        List<String> results = new ArrayList<>();
        results.add("Actinver");
        results.add("Todas las Demas");
         
        return results;
    }
	
	public List<String> getLstMoneda(String query) {
        List<String> results = new ArrayList<>();
        results.add("MX");
        results.add("USD");
         
        return results;
    }
	
	public List<String> getLstTipoSocInversion(String query) {
        List<String> results = new ArrayList<>();
        results.add("Deuda");
        results.add("Renta Variable");
        results.add("Cobertura");
         
        return results;
    }
	
	public List<String> getLsthorizonteInversion(String query) {
        List<String> results = new ArrayList<>();
        results.add("Corto Plazo");
        results.add("Largo Plazo");
         
        return results;
    }
	
	public List<String> getLstCalRiesgoMercado(String query) {
        List<String> results = new ArrayList<>();
        results.add("1N");
        results.add("2N");
         
        return results;
    }
	
	public List<String> getLstCalRiesgoCredito(String query) {
		List<String> results = new ArrayList<>();
		results.add("3N");
		results.add("4N");
		
		return results;
	}
	
	public List<String> getLstTipPerOperarClase(String query) {
		List<String> results = new ArrayList<>();
		results.add("Física");
		results.add("Moral");
		results.add("Física Exenta");
		results.add("Moral Exenta");
		results.add("Por contrato");
		results.add("Fondo de Fondos");
		
		return results;
	}


}
