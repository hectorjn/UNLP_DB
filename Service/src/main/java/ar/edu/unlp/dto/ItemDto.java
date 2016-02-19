package ar.edu.unlp.dto;

import java.util.Date;
import java.util.Set;

/**
 * Created by jn on 2/12/16.
 */
public class ItemDto implements BaseDto{
    private Integer id;
    private String tituloItem;
    private String descripcion;
    private Date fechaCreacion;
    private String prioridad;
    private EstadoDto estadoActual;
    private ProyectoDto proyecto;
    private TipoItemDto tipoItem;
    private UsuarioRolEquipoDto responsable;
    private Set<TransicionItemDto> transacciones;

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

    public EstadoDto getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoDto estadoActual) {
        this.estadoActual = estadoActual;
    }

    public ProyectoDto getProyecto() {
        return proyecto;
    }

    public void setProyecto(ProyectoDto proyecto) {
        this.proyecto = proyecto;
    }

    public TipoItemDto getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(TipoItemDto tipoItem) {
        this.tipoItem = tipoItem;
    }

    public UsuarioRolEquipoDto getResponsable() {
        return responsable;
    }

    public void setResponsable(UsuarioRolEquipoDto responsable) {
        this.responsable = responsable;
    }

    public Set<TransicionItemDto> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Set<TransicionItemDto> transacciones) {
        this.transacciones = transacciones;
    }

}
