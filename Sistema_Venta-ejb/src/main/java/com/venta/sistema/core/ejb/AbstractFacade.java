/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema.core.ejb;

import java.util.List;
import javax.persistence.EntityManager;

/**
 * @param<T>
 * @author angel
 */
public abstract class AbstractFacade<T> {

    private Class<?> classEntity;

    public AbstractFacade(Class<?> classEntity) {
        this.classEntity = classEntity;
    }

    public AbstractFacade() {
    }

    public long save(T t) {
        long record = 0l;
        try {
            getEntityManager().persist(t);
            record = System.currentTimeMillis();
        } catch (Throwable tr) {
            System.err.println(tr.getMessage() + " " + tr.getLocalizedMessage());
        }
        return record;
    }

    public long edit(T t) {
        long record = 0l;
        try {
            getEntityManager().merge(t);
            record = System.currentTimeMillis();
        } catch (Throwable tr) {
            System.err.println(tr.getMessage() + " " + tr.getLocalizedMessage());
        }
        return record;
    }

    public long delete(T t) {
        long record = 0l;
        try {
            getEntityManager().remove(t);
            record = System.currentTimeMillis();
        } catch (Throwable tr) {
            System.err.println(tr.getMessage() + " " + tr.getLocalizedMessage());
        }
        return record;
    }

    public long delete(Integer t) {
        long record = 0l;
        try {
            getEntityManager().remove(findById(t));
            record = System.currentTimeMillis();
        } catch (Throwable tr) {
            System.err.println(tr.getMessage() + " " + tr.getLocalizedMessage());
        }
        return record;
    }

    public T findByAttribute(String attr, String val) {
        String search = " t where t." + attr + " like %" + val + "%;";
        try {
            return (T) getEntityManager()
                    .createNativeQuery("select * from " + classEntity.getName() + search).getSingleResult();
        } catch (Throwable tr) {
            System.err.println(tr.getMessage() + " " + tr.getLocalizedMessage());
        }
        return null;
    }

    public T findById(Integer val) {
        long record = 0l;
        try {
            return (T) getEntityManager().find(classEntity, val);
        } catch (Throwable tr) {
            System.err.println(tr.getMessage() + " " + tr.getLocalizedMessage());
        }
        return null;
    }

    public List<T> findAllByAttribute(String attr, String val) {
        String search = " t where t." + attr + " like %" + val + "%;";
        try {
            return (List<T>) getEntityManager()
                    .createNativeQuery("select * from " + classEntity.getName() + search).getResultList();
        } catch (Throwable tr) {
            System.err.println(tr.getMessage() + " " + tr.getLocalizedMessage());
        }
        return null;
    }

    public List<T> find() {
       // String search = " t where t." + attr + " like %" + val + "%;";
        try {
            return (List<T>) getEntityManager()
                    .createNativeQuery("select * from " + classEntity.getName() +" t").getResultList();
        } catch (Throwable tr) {
            System.err.println(tr.getMessage() + " " + tr.getLocalizedMessage());
        }
        return null;
    }

    public abstract EntityManager getEntityManager();
}
