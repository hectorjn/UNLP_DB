package ar.edu.unlp.entities;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by jn on 2/12/16.
 */
public class TransicionItem extends BaseEntity {
    private Integer id;
    private Date fecha;
    private String comentario;
    private UsuarioRolEquipo actor;
    private Item item;
    private WorkFlow workflow;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransicionItem that = (TransicionItem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (comentario != null ? !comentario.equals(that.comentario) : that.comentario != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (comentario != null ? comentario.hashCode() : 0);
        return result;
    }

    public UsuarioRolEquipo getActor() {
        return actor;
    }

    public void setActor(UsuarioRolEquipo actor) {
        this.actor = actor;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public WorkFlow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(WorkFlow workflow) {
        this.workflow = workflow;
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
