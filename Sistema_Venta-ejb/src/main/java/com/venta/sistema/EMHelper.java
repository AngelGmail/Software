/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema;

import javax.enterprise.context.RequestScoped;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author angel
 */
@Singleton
public class EMHelper {

    private static ThreadLocal<EntityManager> thread;

    @PersistenceUnit(unitName = "Venta-PU", name = "Prod")
    private static EntityManager entityManager;

    public static EntityManager getEntityManager() {
        thread = new ThreadLocal<>();
        EntityManager em = thread.get();
        if (em == null) {
            thread.set(entityManager);
        }
        return thread.get();
    }
    
    public static void close(){
        EntityManager em = null;
        thread.set(em);
    }
}
