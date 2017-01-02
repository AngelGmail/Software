/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FlushModeType;
import javax.persistence.Persistence;

/**
 *
 * @author angel
 */
public class EMHelper {

    private static  ThreadLocal<EntityManager> THREAD;
    private static  EntityManagerFactory EMF;

    static {
        try {
            EMF = Persistence.createEntityManagerFactory("Venta_PU");
            THREAD = new ThreadLocal<>();
        } catch (ExceptionInInitializerError e) {
            System.out.println(e.getCause() + " -$- " + e.getLocalizedMessage());
        }
    }

    public static EntityManager getEntityManager() {
        EntityManager em = THREAD.get();
        if (em == null) {
            em = EMF.createEntityManager();
            em.setFlushMode(FlushModeType.COMMIT);
            THREAD.set(em);
        }
        return THREAD.get();
    }

    public static void close() {
        EntityManager em = null;
        THREAD.set(em);
    }
}
