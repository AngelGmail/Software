/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema.core.ejb;

import java.util.List;
import javax.ejb.Remote;

/**
 * @param <T>
 * @author angel
 */
@Remote
public interface CoreFacadeRemote <T>{
    
    long save(T t);

    long edit(T t);

    long delete(T t);

    long delete(Integer t);

    T findByAttribute(String attr, String val);

    T findById(Integer val);

    List<T> findAllByAttribute(String attr, String val);

    List<T> find();

    void setClassEntity(Class<?> classEntity);
}
