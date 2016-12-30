/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.EstadoCivil;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author angel
 */
public class EstadoCivilDao extends CoreFacade<EstadoCivil> {

    @EJB
    private CoreFacadeLocal ejbRef;

    public EstadoCivilDao() {
        super(EstadoCivil.class);
    }

    @Override
    public long save(EstadoCivil t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(EstadoCivil t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(EstadoCivil t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public EstadoCivil findByAttribute(String attr, String val) {
        return (EstadoCivil) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public EstadoCivil findById(Integer val) {
        return (EstadoCivil) ejbRef.findById(val);
    }

    @Override
    public List<EstadoCivil> findAllByAttribute(String attr, String val) {
        return (List<EstadoCivil>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<EstadoCivil> find() {
        return (List<EstadoCivil>) ejbRef.find();
    }
}
