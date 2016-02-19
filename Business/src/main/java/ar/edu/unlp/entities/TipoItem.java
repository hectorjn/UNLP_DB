package ar.edu.unlp.entities;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by jn on 2/12/16.
 */
public class TipoItem extends BaseEntity {
    private Integer id;
    private String descripcion;
    private Set<Estado> estados;
    private Proyecto proyecto;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoItem tipoItem = (TipoItem) o;
        if (id != null ? !id.equals(tipoItem.id) : tipoItem.id != null) return false;
        if (descripcion != null ? !descripcion.equals(tipoItem.descripcion) : tipoItem.descripcion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return  result;
    }

    public Set<Estado> getEstados() {
        return estados;
    }

    public void setEstados(Set<Estado> estados) {
        this.estados = estados;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
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
