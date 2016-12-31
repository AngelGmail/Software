package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.Usuarios;

import javax.ejb.EJB;
import java.util.List;

/**
 * Created by angel on 12/31/2016.
 */
public class UsuariosDao extends CoreFacade<Usuarios> {

    @EJB
    private CoreFacadeLocal ejbRef;

    public UsuariosDao() {
        super(Usuarios.class);
    }

    @Override
    public long save(Usuarios t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(Usuarios t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(Usuarios t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public Usuarios findByAttribute(String attr, String val) {
        return (Usuarios) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public Usuarios findById(Integer val) {
        return (Usuarios) ejbRef.findById(val);
    }

    @Override
    public List<Usuarios> findAllByAttribute(String attr, String val) {
        return (List<Usuarios>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<Usuarios> find() {
        return (List<Usuarios>) ejbRef.find();
    }

}