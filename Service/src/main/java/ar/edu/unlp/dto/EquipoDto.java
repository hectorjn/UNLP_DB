package ar.edu.unlp.dto;

import java.util.Set;

/**
 * Created by jn on 2/12/16.
 */
public class EquipoDto implements BaseDto {
    private Integer id;
    private String nombre;
    private ProyectoDto proyecto;
    private Set<EquipoAtencionDto> estadosAtendidos;
    private Set<UsuarioRolEquipoDto> integrantes;

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

    public ProyectoDto getProyecto() {
        return proyecto;
    }

    public void setProyecto(ProyectoDto proyecto) {
        this.proyecto = proyecto;
    }

    public Set<EquipoAtencionDto> getEstadosAtendidos() {
        return estadosAtendidos;
    }

    public void setEstadosAtendidos(Set<EquipoAtencionDto> estadosAtendidos) {
        this.estadosAtendidos = estadosAtendidos;
    }

    public Set<UsuarioRolEquipoDto> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Set<UsuarioRolEquipoDto> integrantes) {
        this.integrantes = integrantes;
    }


}
