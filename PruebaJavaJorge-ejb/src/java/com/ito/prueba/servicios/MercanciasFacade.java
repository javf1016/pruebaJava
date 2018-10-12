/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ito.prueba.servicios;

import com.ito.prueba.entidad.Mercancias;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author javf1016
 */
@Stateless
public class MercanciasFacade extends AbstractFacade<Mercancias> implements MercanciasFacadeLocal {

    @PersistenceContext(unitName = "PruebaJAVA-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MercanciasFacade() {
        super(Mercancias.class);
    }
    
}
