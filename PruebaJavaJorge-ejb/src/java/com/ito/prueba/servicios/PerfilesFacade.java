/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ito.prueba.servicios;

import com.ito.prueba.entidad.Perfiles;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author javf1016
 */
@Stateless
public class PerfilesFacade extends AbstractFacade<Perfiles> implements PerfilesFacadeLocal {

    @PersistenceContext(unitName = "PruebaJAVA-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PerfilesFacade() {
        super(Perfiles.class);
    }
    
}
