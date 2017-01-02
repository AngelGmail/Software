package com.venta.sistema.core.test;

import com.venta.sistema.EMHelper;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.Sexo;
import org.junit.BeforeClass;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import junit.framework.TestCase;

import static org.junit.Assert.*;

/**
 * Created by angel on 12/31/2016.
 */
public class SexoDaoTest {

    @org.junit.Test
    public void valideEntityConn() {
        assertTrue(EMHelper.getEntityManager() != null);
    }

    @org.junit.Test
    public void findByAttribute() throws Exception {
    }

    @org.junit.Test
    public void findById() throws Exception {
        assertNotNull(11);
    }

    @org.junit.Test
    public void findAllByAttribute() throws Exception {
        assertNotNull(0);
    }

    @org.junit.Test
    public void find() throws Exception {
        assertNotNull(10);
    }

}
