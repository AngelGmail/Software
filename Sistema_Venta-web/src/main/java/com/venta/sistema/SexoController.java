/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema;

import com.venta.sistema.core.dao.SexoDao;
import com.venta.sistema.core.ejb.CoreFacadeLocal;
import com.venta.sistema.core.model.Sexo;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
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

    @Inject
    SexoDao sexoDao;
    public List<Sexo> getAll() {
        return sexoDao.find();
    }
}
