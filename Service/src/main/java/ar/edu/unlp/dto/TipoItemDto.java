package ar.edu.unlp.dto;

import ar.edu.unlp.entities.BaseEntity;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by jn on 2/12/16.
 */
public class TipoItemDto implements BaseDto {
    private Integer id;
    private String descripcion;
    private Set<EstadoDto> estados;
    private ProyectoDto proyecto;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<EstadoDto> getEstados() {
        return estados;
    }

    public void setEstados(Set<EstadoDto> estados) {
        this.estados = estados;
    }

    public ProyectoDto getProyecto() {
        return proyecto;
    }

    public void setProyecto(ProyectoDto proyecto) {
        this.proyecto = proyecto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
