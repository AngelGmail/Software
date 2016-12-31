package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.Permisos;

import javax.ejb.EJB;
import java.util.List;

/**
 * Created by angel on 12/30/2016.
 */
public class PermisosDao extends CoreFacade<Permisos> {

    @EJB
    private CoreFacadeLocal ejbRef;

    public PermisosDao() {
        super(Permisos.class);
    }

    @Override
    public long save(Permisos t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(Permisos t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(Permisos t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public Permisos findByAttribute(String attr, String val) {
        return (Permisos) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public Permisos findById(Integer val) {
        return (Permisos) ejbRef.findById(val);
    }

    @Override
    public List<Permisos> findAllByAttribute(String attr, String val) {
        return (List<Permisos>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<Permisos> find() {
        return (List<Permisos>) ejbRef.find();
    }

}
