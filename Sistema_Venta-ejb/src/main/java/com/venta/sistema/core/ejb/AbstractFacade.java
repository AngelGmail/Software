/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema.core.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 * @param<T>
 * @author angel
 */
@Stateless
public abstract class AbstractFacade<T> {

    protected Class<?> classEntity;

    public AbstractFacade(Class<?> classEntity) {
        this.classEntity = classEntity;
    }

    public AbstractFacade() {
    }

    public long save(T t) {
        long record = 0l;
        try {
            getSession().save(t);
            record = System.currentTimeMillis();
        } catch (Throwable tr) {
            System.err.println(tr.getMessage() + " " + tr.getLocalizedMessage());
        }
        return record;
    }

    public long edit(T t) {
        long record = 0l;
        try {
            getSession().update(t);
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
            getEntityManager().unwrap( Session.class )
                      .createCriteria( classEntity )
                               .list();
//            return (T) getSession().createCriteria(classEntity)
//                    .add(Restrictions.ilike(attr, val, MatchMode.ANYWHERE)).uniqueResult();
        } catch (HibernateException tr) {
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
            return (List<T>) getSession().createCriteria(classEntity)
                    .add(Restrictions.ilike(attr, val, MatchMode.ANYWHERE)).list();
        } catch (Throwable tr) {
            System.err.println(tr.getMessage() + " " + tr.getLocalizedMessage());
        }
        return null;
    }

    public List<T> find() {
        // String search = " t where t." + attr + " like %" + val + "%;";
        try {
            return (List<T>) getSession().createCriteria(classEntity).list();
        } catch (HibernateException tr) {
            System.err.println(tr.getMessage() + " " + tr.getLocalizedMessage());
        }
        return null;
    }

    public abstract EntityManager getEntityManager();

    public abstract Session getSession();

    public void setClassEntity(Class<?> classEntity){
        this.classEntity = classEntity;
    }
}
