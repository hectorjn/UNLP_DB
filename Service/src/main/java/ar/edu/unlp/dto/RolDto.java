package ar.edu.unlp.dto;

/**
 * Created by jn on 2/16/16.
 */
public class RolDto implements BaseDto {
    private Integer id;
    private String nombre;


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
}
