package ar.edu.unlp.dto;

import java.util.Date;
import java.util.Set;

/**
 * Created by jn on 2/12/16.
 */
public class ProyectoDto implements BaseDto{

    private Integer id;
    private String nombre;
    private String objetivo;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean productivo;
    private Set<EquipoDto> equipos;
    private UsuarioDto lider;
    private Set<ItemDto> items;
    private Set<TipoItemDto> tiposItem;

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


    public Set<EquipoDto> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<EquipoDto> equipos) {
        this.equipos = equipos;
    }

    public UsuarioDto getLider() {
        return lider;
    }

    public void setLider(UsuarioDto lider) {
        this.lider = lider;
    }

    public Set<ItemDto> getItems() {
        return items;
    }

    public void setItems(Set<ItemDto> items) {
        this.items = items;
    }

    public Set<TipoItemDto> getTiposItem() {
        return tiposItem;
    }

    public void setTiposItem(Set<TipoItemDto> tiposItem) {
        this.tiposItem = tiposItem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
