/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema.core.dao;

import com.venta.sistema.core.ejb.CoreFacade;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.Articulo;
import com.venta.sistema.core.model.Sexo;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author angel
 */
public class ArticuloDao extends CoreFacade<Articulo>{
    
       @EJB
    private CoreFacadeLocal ejbRef;
    
    public  ArticuloDao(){
        super(Articulo.class);
    }
    
    @Override
    public long save(Articulo t) {
        return ejbRef.save(t);
    }

    @Override
    public long edit(Articulo t) {
        return ejbRef.edit(t);
    }

    @Override
    public long delete(Articulo t) {
        return ejbRef.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return ejbRef.delete(t);
    }

    @Override
    public Articulo findByAttribute(String attr, String val) {
        return (Articulo) ejbRef.findByAttribute(attr, val);
    }

    @Override
    public Articulo findById(Integer val) {
        return (Articulo) ejbRef.findById(val);
    }

    @Override
    public List<Articulo> findAllByAttribute(String attr, String val) {
        return (List<Articulo>) ejbRef.findAllByAttribute(attr, val);
    }

    @Override
    public List<Articulo> find() {
        return (List<Articulo>) ejbRef.find();
    }
}
