/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ito.prueba.bean;

import com.ito.prueba.entidad.Mercancias;
import com.ito.prueba.servicios.MercanciasFacadeLocal;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author javf1016
 */
@RequestScoped
@Named("mercanciaBean")
public class MercanciaBean {

    @EJB
    private MercanciasFacadeLocal mercanciasFacade;
    
    private String nombreProducto;
    
    private String ciudadDestino;
    
    private String direccion;

    private Date fechaSalida;
    
    private Integer precio;
    
    private String estadoEnvio;
    
    private Integer destinatarioId;
    
    private Integer usuarioRegistroId;
    
    public MercanciaBean() {
    }
    /**
     *
     * @return
     */
    public List<Mercancias> getMercancia(){
            return mercanciasFacade.findAll();
    }
    
    public String crear(){
        Mercancias mercancia = new Mercancias();
        
        mercancia.setNombreProducto(nombreProducto);
        mercancia.setCiudadDestino(ciudadDestino);
        mercancia.setDireccion(direccion);
        mercancia.setFechaSalida(fechaSalida);
        mercancia.setPrecio(precio);
        mercancia.setEstadoEnvio(estadoEnvio);
        mercancia.setDestinatarioId(destinatarioId);
        mercancia.setUsuarioRegistroId(usuarioRegistroId);
        mercanciasFacade.create(mercancia);
        return "mercancia";
    }

    public MercanciasFacadeLocal getMercanciasFacade() {
        return mercanciasFacade;
    }

    public void setMercanciasFacade(MercanciasFacadeLocal mercanciasFacade) {
        this.mercanciasFacade = mercanciasFacade;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public Integer getDestinatarioId() {
        return destinatarioId;
    }

    public void setDestinatarioId(Integer destinatarioId) {
        this.destinatarioId = destinatarioId;
    }

    public Integer getUsuarioRegistroId() {
        return usuarioRegistroId;
    }

    public void setUsuarioRegistroId(Integer usuarioRegistroId) {
        this.usuarioRegistroId = usuarioRegistroId;
    }
    
    
    
}
    

