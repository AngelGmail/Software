package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.TipoDni;

import javax.ejb.EJB;
import java.util.List;

/**
 * Created by angel on 12/31/2016.
 */
public class TipoDniDao extends CoreFacade<TipoDni> {

    @EJB
    private CoreFacadeLocal ejbRef;

    public TipoDniDao() {
        super(TipoDni.class);
    }

    @Override
    public long save(TipoDni t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(TipoDni t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(TipoDni t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public TipoDni findByAttribute(String attr, String val) {
        return (TipoDni) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public TipoDni findById(Integer val) {
        return (TipoDni) ejbRef.findById(val);
    }

    @Override
    public List<TipoDni> findAllByAttribute(String attr, String val) {
        return (List<TipoDni>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<TipoDni> find() {
        return (List<TipoDni>) ejbRef.find();
    }

}