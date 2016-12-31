package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.Familia;

import javax.ejb.EJB;
import java.util.List;

/**
 * Created by angel on 12/30/2016.
 */
public class FamiliaDao extends CoreFacade<Familia> {

    @EJB
    private CoreFacadeLocal ejbRef;

    public FamiliaDao() {
        super(Familia.class);
    }

    @Override
    public long save(Familia t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(Familia t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(Familia t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public Familia findByAttribute(String attr, String val) {
        return (Familia) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public Familia findById(Integer val) {
        return (Familia) ejbRef.findById(val);
    }

    @Override
    public List<Familia> findAllByAttribute(String attr, String val) {
        return (List<Familia>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<Familia> find() {
        return (List<Familia>) ejbRef.find();
    }

}
