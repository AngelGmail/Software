/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema;

import javax.persistence.FlushModeType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author angel
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = buildSessionFactory();
    private static ThreadLocal<Session> threadLocal = new ThreadLocal<>();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            return configuration.configure().buildSessionFactory(
                    new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
        } catch (Throwable e) {
            new ExceptionInInitializerError(e);
        }
        return null;
    }

    public static Session getSession() {
        Session session = threadLocal.get();
        
        if(session == null || session.isOpen()){
            session = buildSessionFactory().getCurrentSession();
            session.setFlushMode(FlushModeType.AUTO);
            threadLocal.set(session);
        }
        return threadLocal.get();
    }
}
