package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.PermisoUsuario;

import javax.ejb.EJB;
import java.util.List;

/**
 * Created by angel on 12/30/2016.
 */
public class PermisoUsuarioDao extends CoreFacade<PermisoUsuario> {

    @EJB
    private CoreFacadeLocal ejbRef;

    public PermisoUsuarioDao() {
        super(PermisoUsuario.class);
    }

    @Override
    public long save(PermisoUsuario t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(PermisoUsuario t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(PermisoUsuario t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public PermisoUsuario findByAttribute(String attr, String val) {
        return (PermisoUsuario) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public PermisoUsuario findById(Integer val) {
        return (PermisoUsuario) ejbRef.findById(val);
    }

    @Override
    public List<PermisoUsuario> findAllByAttribute(String attr, String val) {
        return (List<PermisoUsuario>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<PermisoUsuario> find() {
        return (List<PermisoUsuario>) ejbRef.find();
    }

}
