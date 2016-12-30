/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venta.sistema.core.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author angel
 */
@Entity
@Table(name = "PERMISOS")
@NamedQueries({
    @NamedQuery(name = "Permisos.findAll", query = "SELECT p FROM Permisos p")})
public class Permisos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    
    @SequenceGenerator(name="permisoseq", allocationSize = 1, sequenceName = "permisos_seq")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ABREV")
    private Character abrev;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACTUALIZADO_EN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "ACTUALIZADO_POR")
    private String actualizadoPor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permisoId", fetch = FetchType.LAZY)
    private List<PermisoUsuario> permisoUsuarioList;

    public Permisos() {
    }

    public Permisos(Integer id) {
        this.id = id;
    }

    public Permisos(Integer id, String descripcion, Character abrev, Date actualizadoEn, String actualizadoPor) {
        this.id = id;
        this.descripcion = descripcion;
        this.abrev = abrev;
        this.actualizadoEn = actualizadoEn;
        this.actualizadoPor = actualizadoPor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getAbrev() {
        return abrev;
    }

    public void setAbrev(Character abrev) {
        this.abrev = abrev;
    }

    public Date getActualizadoEn() {
        return actualizadoEn;
    }

    public void setActualizadoEn(Date actualizadoEn) {
        this.actualizadoEn = actualizadoEn;
    }

    public String getActualizadoPor() {
        return actualizadoPor;
    }

    public void setActualizadoPor(String actualizadoPor) {
        this.actualizadoPor = actualizadoPor;
    }

    public List<PermisoUsuario> getPermisoUsuarioList() {
        return permisoUsuarioList;
    }

    public void setPermisoUsuarioList(List<PermisoUsuario> permisoUsuarioList) {
        this.permisoUsuarioList = permisoUsuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permisos)) {
            return false;
        }
        Permisos other = (Permisos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.venta.sistema.core.model.Permisos[ id=" + id + " ]";
    }
    
}
