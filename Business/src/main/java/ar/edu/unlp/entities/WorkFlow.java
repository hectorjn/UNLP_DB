package ar.edu.unlp.entities;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * Created by jn on 2/12/16.
 */
public class WorkFlow  extends BaseEntity{
    private Integer id;
    private Estado estadoSiguiente;
    private Estado estadoActual;

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

        WorkFlow workFlow = (WorkFlow) o;

        if (id != null ? !id.equals(workFlow.id) : workFlow.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public Estado getEstadoSiguiente() {
        return estadoSiguiente;
    }

    public void setEstadoSiguiente(Estado estadoSiguiente) {
        this.estadoSiguiente = estadoSiguiente;
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }


    @Override
    @Transient
    public Serializable getPrimaryKey() {
        return id;
    }
}
