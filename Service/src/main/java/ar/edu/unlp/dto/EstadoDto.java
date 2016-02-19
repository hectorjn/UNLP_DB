package ar.edu.unlp.dto;

import java.util.Set;

/**
 * Created by jn on 2/12/16.
 */
public class EstadoDto implements BaseDto{

    private Integer id;
    private String nombre;
    private String tipoEstado;
    private EquipoAtencionDto equiposAtencion;
    private TipoItemDto tipoItem;
    private Set<WorkFlowDto> estadosAnteriores;
    private Set<WorkFlowDto> estadosSiguientes;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EquipoAtencionDto getEquiposAtencion() {
        return equiposAtencion;
    }

    public void setEquiposAtencion(EquipoAtencionDto equiposAtencion) {
        this.equiposAtencion = equiposAtencion;
    }

    public TipoItemDto getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(TipoItemDto tipoItem) {
        this.tipoItem = tipoItem;
    }

    public Set<WorkFlowDto> getEstadosAnteriores() {
        return estadosAnteriores;
    }

    public void setEstadosAnteriores(Set<WorkFlowDto> estadosAnteriores) {
        this.estadosAnteriores = estadosAnteriores;
    }

    public Set<WorkFlowDto> getEstadosSiguientes() {
        return estadosSiguientes;
    }

    public void setEstadosSiguientes(Set<WorkFlowDto> estadosSiguientes) {
        this.estadosSiguientes = estadosSiguientes;
    }


}
