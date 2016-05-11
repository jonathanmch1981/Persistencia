/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.investigacion.entities;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author jonathan
 */
@Entity
@Table(name = "USUARIOS", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT b FROM Usuarios b")})
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUSUARIOS")
    @XmlElement(name = "IDUSUARIOS")
    private int idusuarios;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "USERNAME")
    @XmlElement(name = "USERNAME")
    private String username;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "PASSWORD")
    @XmlElement(name = "PASSWORD")
    private String password;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "F_TIMESTAMP")
    @XmlElement(name = "F_TIMESTAMP")
    private java.sql.Date f_timestamp;

    public Usuarios() {
    }

    public Usuarios(int idusuarios, String username, String password, Date f_timestamp) {
        this.idusuarios = idusuarios;
        this.username = username;
        this.password = password;
        this.f_timestamp = f_timestamp;
    }

    public int getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(int idusuarios) {
        this.idusuarios = idusuarios;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getF_timestamp() {
        return f_timestamp;
    }

    public void setF_timestamp(Date f_timestamp) {
        this.f_timestamp = f_timestamp;
    }
    
    @Override
    public String toString() {
        return "Usuarios{" + "idusuarios=" + idusuarios + ", username=" + username + ", password=" + password + ", f_timestamp=" + f_timestamp + '}';
    }
}
