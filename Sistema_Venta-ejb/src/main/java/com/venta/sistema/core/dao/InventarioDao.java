package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.Inventario;

import javax.ejb.EJB;
import java.util.List;

/**
 * Created by angel on 12/30/2016.
 */
public class InventarioDao extends CoreFacade<Inventario> {

    @EJB
    private CoreFacadeLocal ejbRef;

    public InventarioDao() {
        super(Inventario.class);
    }

    @Override
    public long save(Inventario t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(Inventario t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(Inventario t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public Inventario findByAttribute(String attr, String val) {
        return (Inventario) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public Inventario findById(Integer val) {
        return (Inventario) ejbRef.findById(val);
    }

    @Override
    public List<Inventario> findAllByAttribute(String attr, String val) {
        return (List<Inventario>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<Inventario> find() {
        return (List<Inventario>) ejbRef.find();
    }

}
