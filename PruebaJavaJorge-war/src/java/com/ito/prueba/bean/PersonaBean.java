/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ito.prueba.bean;

import com.ito.prueba.entidad.Perfiles;
import com.ito.prueba.entidad.Personas;
import com.ito.prueba.entidad.Usuarios;
import com.ito.prueba.servicios.PerfilesFacadeLocal;
import com.ito.prueba.servicios.PersonasFacadeLocal;
import com.ito.prueba.servicios.UsuariosFacadeLocal;
import java.util.Date;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author javf1016
 */
@Named(value = "personaBean")
@Dependent
public class PersonaBean {

    @EJB
    private UsuariosFacadeLocal usuariosFacade;

    @EJB
    private PersonasFacadeLocal personasFacade;

    @EJB
    private PerfilesFacadeLocal perfilesFacade;

    private String nombre;
    
    private String apellido;
    
    private Integer numeroDocumento;
    
    private String contrasena;
    
    private Date perfil;
    
    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }
    
    
    public String crear(){
        Perfiles perfile = new Perfiles();
        Personas persona= new Personas();
        Usuarios usuario = new Usuarios();
        
        perfile.setPerfil(perfil);
        
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setNumeroDocumento(numeroDocumento);
        
        usuario.setContrasena(contrasena);
        
        perfilesFacade.create(perfile);        
        personasFacade.create(persona);
        usuariosFacade.create(usuario);
        
        return "usuario";
    }

    public UsuariosFacadeLocal getUsuariosFacade() {
        return usuariosFacade;
    }

    public void setUsuariosFacade(UsuariosFacadeLocal usuariosFacade) {
        this.usuariosFacade = usuariosFacade;
    }

    public PersonasFacadeLocal getPersonasFacade() {
        return personasFacade;
    }

    public void setPersonasFacade(PersonasFacadeLocal personasFacade) {
        this.personasFacade = personasFacade;
    }

    public PerfilesFacadeLocal getPerfilesFacade() {
        return perfilesFacade;
    }

    public void setPerfilesFacade(PerfilesFacadeLocal perfilesFacade) {
        this.perfilesFacade = perfilesFacade;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getPerfil() {
        return perfil;
    }

    public void setPerfil(Date perfil) {
        this.perfil = perfil;
    }
    
    
}
