package ar.edu.unlp.entities;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * Created by jn on 2/12/16.
 */
public class UsuarioRolEquipo extends BaseEntity{
    private Integer id;
    private Boolean esLider;
    private Boolean activo;
    private Item itemsAsignados;
    private Equipo equipo;
    private Rol rol;
    private Usuario usuario;

    public Boolean getEsLider() {
        return esLider;
    }

    public void setEsLider(Boolean esLider) {
        this.esLider = esLider;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioRolEquipo that = (UsuarioRolEquipo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (esLider != null ? !esLider.equals(that.esLider) : that.esLider != null) return false;
        if (activo != null ? !activo.equals(that.activo) : that.activo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (esLider != null ? esLider.hashCode() : 0);
        result = 31 * result + (activo != null ? activo.hashCode() : 0);
        return result;
    }

    public Item getItemsAsignados() {
        return itemsAsignados;
    }

    public void setItemsAsignados(Item itemsAsignados) {
        this.itemsAsignados = itemsAsignados;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    @Transient
    public Serializable getPrimaryKey() {
        return id;
    }
}
