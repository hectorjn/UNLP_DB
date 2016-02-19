package ar.edu.unlp.dto;

/**
 * Created by jn on 2/12/16.
 */
public class EquipoAtencionDto implements BaseDto {
    private Integer id;
    private EquipoDto equipo;
    private EstadoDto estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EquipoDto getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoDto equipo) {
        this.equipo = equipo;
    }

    public EstadoDto getEstado() {
        return estado;
    }

    public void setEstado(EstadoDto estado) {
        this.estado = estado;
    }


}
