package ar.edu.unlp.entities;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * Created by jn on 2/12/16.
 */
@Entity
public class Rol  extends BaseEntity{
    private Integer id;
    private String nombre;
    private List<Usuario> usuarios;

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

        Rol rol = (Rol) o;

        if (id != null ? !id.equals(rol.id) : rol.id != null) return false;
        if (nombre != null ? !nombre.equals(rol.nombre) : rol.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    @Transient
    public Serializable getPrimaryKey() {
        return getId();
    }

    public Rol() {
    }
}
