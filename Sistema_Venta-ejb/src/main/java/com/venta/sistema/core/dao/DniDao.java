/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.Dni;
import com.venta.sistema.core.model.Sexo;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author angel
 */
public class DniDao extends CoreFacade<Dni>{
    
       @EJB
    private CoreFacadeLocal ejbRef;
    
    public  DniDao(){
        super(Dni.class);
    }
    
    @Override
    public long save(Dni t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(Dni t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(Dni t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public Dni findByAttribute(String attr, String val) {
        return (Dni) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public Dni findById(Integer val) {
        return (Dni) ejbRef.findById(val);
    }

    @Override
    public List<Dni> findAllByAttribute(String attr, String val) {
        return (List<Dni>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<Dni> find() {
        return (List<Dni>) ejbRef.find();
    }
}
