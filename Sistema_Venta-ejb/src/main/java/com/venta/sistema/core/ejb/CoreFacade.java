/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema.core.ejb;

import com.venta.sistema.EMHelper;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 * @param <T>
 * @author angel
 */
@Remote(CoreFacadeRemote.class)
@Local(CoreFacadeLocal.class)
@Stateless
@LocalBean
public class CoreFacade<T> extends AbstractFacade<T>
        implements CoreFacadeLocal<T>, CoreFacadeRemote<T> {

    @Override
    public long save(T t) {
        return 0l;
    }

    @Override
    public long edit(T t) {
        return 0l;
    }

    @Override
    public long delete(T t) {
        return 0l;
    }

    @Override
    public long delete(Integer t) {
        return 0l;
    }

    @Override
    public T findByAttribute(String attr, String val) {
        return null;
    }

    @Override
    public T findById(Integer val) {
        return null;
    }

    @Override
    public List<T> findAllByAttribute(String attr, String val) {
        return null;
    }

    @Override
    public List<T> find() {
        return null;
    }
    
    @Override
    public EntityManager getEntityManager(){
        return EMHelper.getEntityManager();
    }
}
