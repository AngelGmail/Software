package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.FacturaDetalle;

import javax.ejb.EJB;
import java.util.List;

/**
 * Created by angel on 12/30/2016.
 */
public class FacturaDetalleDao extends CoreFacade<FacturaDetalle> {

    @EJB
    private CoreFacadeLocal ejbRef;

    public FacturaDetalleDao() {
        super(FacturaDetalle.class);
    }

    @Override
    public long save(FacturaDetalle t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(FacturaDetalle t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(FacturaDetalle t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public FacturaDetalle findByAttribute(String attr, String val) {
        return (FacturaDetalle) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public FacturaDetalle findById(Integer val) {
        return (FacturaDetalle) ejbRef.findById(val);
    }

    @Override
    public List<FacturaDetalle> findAllByAttribute(String attr, String val) {
        return (List<FacturaDetalle>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<FacturaDetalle> find() {
        return (List<FacturaDetalle>) ejbRef.find();
    }

}
