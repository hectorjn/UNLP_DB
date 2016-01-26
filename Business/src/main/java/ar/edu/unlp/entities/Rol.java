package ar.edu.unlp.entities;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by jn on 1/23/16.
 */
@Entity
public class Rol extends BaseEntity {

    private Integer id;
    private String nombre;

    public Rol() {
    }

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
    public Serializable getPrimaryKey() {
        return id;
    }
}
