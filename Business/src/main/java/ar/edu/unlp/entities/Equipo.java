package ar.edu.unlp.entities;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by jn on 2/12/16.
 */
public class Equipo extends BaseEntity {
    private Integer id;
    private String nombre;
    private Proyecto proyecto;
    private Set<EquipoAtencion> estadosAtendidos;
    private Set<UsuarioRolEquipo> integrantes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipo equipo = (Equipo) o;

        if (id != null ? !id.equals(equipo.id) : equipo.id != null) return false;
        if (nombre != null ? !nombre.equals(equipo.nombre) : equipo.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Set<EquipoAtencion> getEstadosAtendidos() {
        return estadosAtendidos;
    }

    public void setEstadosAtendidos(Set<EquipoAtencion> estadosAtendidos) {
        this.estadosAtendidos = estadosAtendidos;
    }

    public Set<UsuarioRolEquipo> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Set<UsuarioRolEquipo> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    @Transient
    public Serializable getPrimaryKey() {
        return id;
    }
}
