/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema.core.ejb;

import com.venta.sistema.HibernateUtil;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import org.hibernate.Session;

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

    public CoreFacade(Class<?> classEntity){
        super(classEntity);
    }
    
    public CoreFacade(){}
    @Override
    public long save(T t) {
        return super.save(t);
    }

    @Override
    public long edit(T t) {
        return super.edit(t);
    }

    @Override
    public long delete(T t) {
        return super.delete(t);
    }

    @Override
    public long delete(Integer t) {
        return super.delete(t);
    }

    @Override
    public T findByAttribute(String attr, String val) {
        return super.findByAttribute(attr, val);
    }

    @Override
    public T findById(Integer val) {
        return super.findById(val);
    }

    @Override
    public List<T> findAllByAttribute(String attr, String val) {
        return super.findAllByAttribute(attr, val);
    }

    @Override
    public List<T> find() {
        return super.find();
    }
    
    @Override
    public Session getEntityManager(){
        return(Session) HibernateUtil.getSession();
    }
    
    @Override
    public Session getSession(){
        return (Session) getEntityManager();
    }

    @Override
    public void setClassEntity(Class<?> classEntity){
        super.classEntity = classEntity;
    }
}
