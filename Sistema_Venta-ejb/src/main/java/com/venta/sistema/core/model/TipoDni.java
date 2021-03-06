package com.venta.sistema.core.model;
// Generated Jan 3, 2017 5:45:21 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TipoDni generated by hbm2java
 */
public class TipoDni  implements java.io.Serializable {


     private int id;
     private String descripcion;
     private Date actualizadoEn;
     private String actualizadoPor;
     private Set dnis = new HashSet(0);

    public TipoDni() {
    }

	
    public TipoDni(int id, String descripcion, Date actualizadoEn, String actualizadoPor) {
        this.id = id;
        this.descripcion = descripcion;
        this.actualizadoEn = actualizadoEn;
        this.actualizadoPor = actualizadoPor;
    }
    public TipoDni(int id, String descripcion, Date actualizadoEn, String actualizadoPor, Set dnis) {
       this.id = id;
       this.descripcion = descripcion;
       this.actualizadoEn = actualizadoEn;
       this.actualizadoPor = actualizadoPor;
       this.dnis = dnis;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getActualizadoEn() {
        return this.actualizadoEn;
    }
    
    public void setActualizadoEn(Date actualizadoEn) {
        this.actualizadoEn = actualizadoEn;
    }
    public String getActualizadoPor() {
        return this.actualizadoPor;
    }
    
    public void setActualizadoPor(String actualizadoPor) {
        this.actualizadoPor = actualizadoPor;
    }
    public Set getDnis() {
        return this.dnis;
    }
    
    public void setDnis(Set dnis) {
        this.dnis = dnis;
    }




}


