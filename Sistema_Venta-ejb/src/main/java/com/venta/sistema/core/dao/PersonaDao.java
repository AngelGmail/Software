package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.Persona;

import javax.ejb.EJB;
import java.util.List;

/**
 * Created by angel on 12/31/2016.
 */
public class PersonaDao extends CoreFacade<Persona> {

    @EJB
    private CoreFacadeLocal ejbRef;

    public PersonaDao() {
        super(Persona.class);
    }

    @Override
    public long save(Persona t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(Persona t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(Persona t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public Persona findByAttribute(String attr, String val) {
        return (Persona) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public Persona findById(Integer val) {
        return (Persona) ejbRef.findById(val);
    }

    @Override
    public List<Persona> findAllByAttribute(String attr, String val) {
        return (List<Persona>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<Persona> find() {
        return (List<Persona>) ejbRef.find();
    }

}