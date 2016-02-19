package ar.edu.unlp.dto;

import ar.edu.unlp.entities.BaseEntity;
import ar.edu.unlp.entities.Rol;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * Created by jn on 2/12/16.
 */
public class UsuarioRolEquipoDto implements BaseDto{
    private Integer id;
    private Boolean esLider;
    private Boolean activo;
    private ItemDto itemsAsignados;
    private EquipoDto equipo;
    private Rol rol;
    private UsuarioDto usuario;

    public Boolean getEsLider() {
        return esLider;
    }

    public void setEsLider(Boolean esLider) {
        this.esLider = esLider;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public ItemDto getItemsAsignados() {
        return itemsAsignados;
    }

    public void setItemsAsignados(ItemDto itemsAsignados) {
        this.itemsAsignados = itemsAsignados;
    }

    public EquipoDto getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoDto equipo) {
        this.equipo = equipo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public UsuarioDto getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDto usuario) {
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
