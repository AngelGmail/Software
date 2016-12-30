/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.EstadoCivil;
import com.venta.sistema.core.model.Factura;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author angel
 */
public class FacturaDao extends CoreFacade<Factura> {

    @EJB
    private CoreFacadeLocal ejbRef;

    public FacturaDao() {
        super(Factura.class);
    }

    @Override
    public long save(Factura t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(Factura t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(Factura t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public Factura findByAttribute(String attr, String val) {
        return (Factura) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public Factura findById(Integer val) {
        return (Factura) ejbRef.findById(val);
    }

    @Override
    public List<Factura> findAllByAttribute(String attr, String val) {
        return (List<Factura>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<Factura> find() {
        return (List<Factura>) ejbRef.find();
    }
}
