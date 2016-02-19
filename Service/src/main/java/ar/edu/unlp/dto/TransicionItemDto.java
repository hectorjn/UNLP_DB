package ar.edu.unlp.dto;

import java.util.Date;

/**
 * Created by jn on 2/12/16.
 */
public class TransicionItemDto implements BaseDto {
    private Integer id;
    private Date fecha;
    private String comentario;
    private UsuarioRolEquipoDto actor;
    private ItemDto item;
    private WorkFlowDto workflow;

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


    public UsuarioRolEquipoDto getActor() {
        return actor;
    }

    public void setActor(UsuarioRolEquipoDto actor) {
        this.actor = actor;
    }

    public ItemDto getItem() {
        return item;
    }

    public void setItem(ItemDto item) {
        this.item = item;
    }

    public WorkFlowDto getWorkflow() {
        return workflow;
    }

    public void setWorkflow(WorkFlowDto workflow) {
        this.workflow = workflow;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
