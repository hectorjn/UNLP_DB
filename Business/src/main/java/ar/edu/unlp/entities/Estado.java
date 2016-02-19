package ar.edu.unlp.entities;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by jn on 2/12/16.
 */
public class Estado  extends BaseEntity{

    private Integer id;
    private String nombre;
    private String tipoEstado;
    private EquipoAtencion equiposAtencion;
    private TipoItem tipoItem;
    private Set<WorkFlow> estadosAnteriores;
    private Set<WorkFlow> estadosSiguientes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Estado estado = (Estado) o;
        if (id != null ? !id.equals(estado.id) : estado.id != null) return false;
        if (nombre != null ? !nombre.equals(estado.nombre) : estado.nombre != null) return false;
        if (tipoEstado != null ? !tipoEstado.equals(estado.tipoEstado) : estado.tipoEstado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null? nombre.hashCode():0);
        result = 31 * result + (tipoEstado != null ? tipoEstado.hashCode() : 0);
        return result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EquipoAtencion getEquiposAtencion() {
        return equiposAtencion;
    }

    public void setEquiposAtencion(EquipoAtencion equiposAtencion) {
        this.equiposAtencion = equiposAtencion;
    }

    public TipoItem getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(TipoItem tipoItem) {
        this.tipoItem = tipoItem;
    }

    public Set<WorkFlow> getEstadosAnteriores() {
        return estadosAnteriores;
    }

    public void setEstadosAnteriores(Set<WorkFlow> estadosAnteriores) {
        this.estadosAnteriores = estadosAnteriores;
    }

    public Set<WorkFlow> getEstadosSiguientes() {
        return estadosSiguientes;
    }

    public void setEstadosSiguientes(Set<WorkFlow> estadosSiguientes) {
        this.estadosSiguientes = estadosSiguientes;
    }

    @Override
    @Transient
    public Serializable getPrimaryKey() {
        return null;
    }
}
