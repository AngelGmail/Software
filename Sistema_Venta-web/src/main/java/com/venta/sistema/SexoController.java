/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema;

import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.Sexo;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author angel
 */
@Named
@ApplicationScoped
public class SexoController {

    @EJB
    private CoreFacadeLocal ejbRef;

    public List<Sexo> getAll() {
        return (List<Sexo>) ejbRef.find();
    }
}
