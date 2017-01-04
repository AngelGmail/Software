/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema.test;

import com.venta.sistema.HibernateUtil;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author angel
 */
public class HibernateUtilTest {
    
    @Test
    public void testSession(){
        assertTrue(HibernateUtil.getSessionFactory()!= null);
    }
}
