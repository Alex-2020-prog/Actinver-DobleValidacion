package com.actinver.app.controler;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

import com.actinver.app.model.Liquidacion;
import com.actinver.app.service.LiquidacionService;

@Named("dtEditView")
@ViewScoped
public class LiquidacionEditView implements Serializable {
	
	private static final long serialVersionUID = -5757414978297049760L;
	private List<Liquidacion> liq1;
    private List<Liquidacion> liq2;
         
    @Inject
    private LiquidacionService service;
     
    @PostConstruct
    public void init() {
    	liq1 = service.createLiquidacion();
    	liq2 = service.createLiquidacion();
    }
 
    public List<Liquidacion> getCars1() {
        return liq1;
    }
 
    public List<Liquidacion> getCars2() {
        return liq2;
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
        FacesMessage msg = new FacesMessage("Car Edited", event.getObject().getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent<Liquidacion> event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", event.getObject().getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onCellEdit(CellEditEvent<?> event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

}
