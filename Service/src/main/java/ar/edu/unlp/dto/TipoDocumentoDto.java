package ar.edu.unlp.dto;

import ar.edu.unlp.entities.BaseEntity;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * Created by jn on 2/12/16.
 */
public class TipoDocumentoDto implements BaseDto{
    private Integer id;
    private String nombre;

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

}
