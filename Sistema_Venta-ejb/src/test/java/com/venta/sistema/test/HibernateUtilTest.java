/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema.test;

import com.venta.sistema.HibernateUtil;
import com.venta.sistema.core.model.Sexo;
import org.hibernate.Session;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author angel
 */
public class HibernateUtilTest {

    @BeforeClass
    public static void setUp() {
        System.out.println("HibernateUtilTest");
    }

    @Before
    public void init() {
        System.out.println("Begin HibernateUtil class ");
    }

    @Test
    public void testGetSessionFactory() {
        assertNotNull("TestGetSessionFactory", HibernateUtil.getSessionFactory());
    }
    
    @Ignore
    public void testgetById(){
        Session session  = HibernateUtil.getSessionFactory().openSession();
        Sexo sexo = session.find(Sexo.class, 1);
        assertNotNull("getElemenentById", sexo);
    }
    
    @Test
    public void close(){
        assertTrue("Close", HibernateUtil.close());
    }

    @After
    public void testEnding() {
        System.out.println("HibernateUtilTest start ending");
    }

    @AfterClass
    public static void destroy() {
        System.out.println("Finished test ");
    }
}
