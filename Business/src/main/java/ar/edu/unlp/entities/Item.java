package ar.edu.unlp.entities;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by jn on 2/12/16.
 */
public class Item  extends BaseEntity{
    private Integer id;
    private String tituloItem;
    private String descripcion;
    private Date fechaCreacion;
    private String prioridad;
    private Estado estadoActual;
    private Proyecto proyecto;
    private TipoItem tipoItem;
    private UsuarioRolEquipo responsable;
    private Set<TransicionItem> transacciones;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTituloItem() {
        return tituloItem;
    }

    public void setTituloItem(String tituloItem) {
        this.tituloItem = tituloItem;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (id != null ? !id.equals(item.id) : item.id != null) return false;
        if (tituloItem != null ? !tituloItem.equals(item.tituloItem) : item.tituloItem != null) return false;
        if (descripcion != null ? !descripcion.equals(item.descripcion) : item.descripcion != null) return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(item.fechaCreacion) : item.fechaCreacion != null)
            return false;
        if (prioridad != null ? !prioridad.equals(item.prioridad) : item.prioridad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (tituloItem != null ? tituloItem.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (prioridad != null ? prioridad.hashCode() : 0);
        return result;
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public TipoItem getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(TipoItem tipoItem) {
        this.tipoItem = tipoItem;
    }

    public UsuarioRolEquipo getResponsable() {
        return responsable;
    }

    public void setResponsable(UsuarioRolEquipo responsable) {
        this.responsable = responsable;
    }

    public Set<TransicionItem> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Set<TransicionItem> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    @Transient
    public Serializable getPrimaryKey() {
        return null;
    }
}
