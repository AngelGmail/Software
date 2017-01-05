/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.Sexo;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;

/**
 *
 * @author angel
 */
@Dependent
public class SexoDao extends CoreFacade<Sexo>{

    @EJB
    private CoreFacadeLocal ejbRef;
    
    public  SexoDao(){
        super(Sexo.class);
    }
    
    @Override
    public long save(Sexo t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(Sexo t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(Sexo t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public Sexo findByAttribute(String attr, String val) {
        return (Sexo) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public Sexo findById(Integer val) {
        return (Sexo) ejbRef.findById(val);
    }

    @Override
    public List<Sexo> findAllByAttribute(String attr, String val) {
        return (List<Sexo>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<Sexo> find() {
        return (List<Sexo>) ejbRef.find();
    }
    
}
