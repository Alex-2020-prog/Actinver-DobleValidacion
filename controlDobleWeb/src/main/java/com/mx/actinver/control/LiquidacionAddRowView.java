package com.mx.actinver.control;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.primefaces.event.RowEditEvent;

import com.mx.actinver.model.Liquidacion;
import com.mx.actinver.service.LiquidacionService;

//@Named("dtLiqAddRowView")
@ManagedBean(name="dtLiqAddRowView")
public class LiquidacionAddRowView implements Serializable {

	private static final long serialVersionUID = 1605745905509056590L;

	private List<Liquidacion> liq1;
	 
    @Inject
    private LiquidacionService service;
     
    @PostConstruct
    public void init() {
        liq1 = service.createLiquidacion();
    }
 
    public List<Liquidacion> getliq1() {
        return liq1;
    }
 
    public List<String> getBrands() {
        return Arrays.asList(LiquidacionService.getBrands());
    }
     
    public List<String> getColors() {
        return Arrays.asList(LiquidacionService.getColors());
    }
 
    public void setService(LiquidacionService service) {
        this.service = service;
    }
     
    public void onRowEdit(RowEditEvent<Liquidacion> event) {
        FacesMessage msg = new FacesMessage("Paying Edited", event.getObject().getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent<Liquidacion> event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", event.getObject().getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public void onAddNew() {
        // Add one new row to the table:
    	Liquidacion liq2Add = new Liquidacion();
        liq1.add(liq2Add);
        FacesMessage msg = new FacesMessage("New paying added", liq2Add.getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
}