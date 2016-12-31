package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.Nacionalidad;

import javax.ejb.EJB;
import java.util.List;

/**
 * Created by angel on 12/30/2016.
 */
public class NacionalidadDao extends CoreFacade<Nacionalidad> {

    @EJB
    private CoreFacadeLocal ejbRef;

    public NacionalidadDao() {
        super(Nacionalidad.class);
    }

    @Override
    public long save(Nacionalidad t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(Nacionalidad t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(Nacionalidad t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public Nacionalidad findByAttribute(String attr, String val) {
        return (Nacionalidad) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public Nacionalidad findById(Integer val) {
        return (Nacionalidad) ejbRef.findById(val);
    }

    @Override
    public List<Nacionalidad> findAllByAttribute(String attr, String val) {
        return (List<Nacionalidad>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<Nacionalidad> find() {
        return (List<Nacionalidad>) ejbRef.find();
    }

}
