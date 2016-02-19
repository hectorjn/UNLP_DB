package ar.edu.unlp.entities;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * Created by jn on 2/12/16.
 */
public class EquipoAtencion extends BaseEntity {
    private Integer id;
    private Equipo equipo;
    private Estado estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EquipoAtencion that = (EquipoAtencion) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    @Transient
    public Serializable getPrimaryKey() {
        return id;
    }
}
