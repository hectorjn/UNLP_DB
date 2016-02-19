package ar.edu.unlp.entities;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by jn on 2/12/16.
 */
public class Proyecto  extends BaseEntity{

    private Integer id;
    private String nombre;
    private String objetivo;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean productivo;
    private Set<Equipo> equipos;
    private Usuario lider;
    private Set<Item> items;
    private Set<TipoItem> tiposItem;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getProductivo() {
        return productivo;
    }

    public void setProductivo(Boolean productivo) {
        this.productivo = productivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Proyecto proyecto = (Proyecto) o;
        if (id != null ? !id.equals(proyecto.id) : proyecto.id != null) return false;
        if (nombre != null ? !nombre.equals(proyecto.nombre) : proyecto.nombre != null) return false;
        if (objetivo != null ? !objetivo.equals(proyecto.objetivo) : proyecto.objetivo != null) return false;
        if (fechaInicio != null ? !fechaInicio.equals(proyecto.fechaInicio) : proyecto.fechaInicio != null)
            return false;
        if (fechaFin != null ? !fechaFin.equals(proyecto.fechaFin) : proyecto.fechaFin != null) return false;
        if (productivo != null ? !productivo.equals(proyecto.productivo) : proyecto.productivo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (objetivo != null ? objetivo.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (productivo != null ? productivo.hashCode() : 0);
        return result;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Usuario getLider() {
        return lider;
    }

    public void setLider(Usuario lider) {
        this.lider = lider;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public Set<TipoItem> getTiposItem() {
        return tiposItem;
    }

    public void setTiposItem(Set<TipoItem> tiposItem) {
        this.tiposItem = tiposItem;
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
