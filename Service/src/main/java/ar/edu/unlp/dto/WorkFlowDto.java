package ar.edu.unlp.dto;

import ar.edu.unlp.entities.BaseEntity;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * Created by jn on 2/12/16.
 */
public class WorkFlowDto implements BaseDto{
    private Integer id;
    private EstadoDto estadoSiguiente;
    private EstadoDto estadoActual;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EstadoDto getEstadoSiguiente() {
        return estadoSiguiente;
    }

    public void setEstadoSiguiente(EstadoDto estadoSiguiente) {
        this.estadoSiguiente = estadoSiguiente;
    }

    public EstadoDto getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoDto estadoActual) {
        this.estadoActual = estadoActual;
    }


}
