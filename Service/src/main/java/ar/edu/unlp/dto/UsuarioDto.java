package ar.edu.unlp.dto;

import ar.edu.unlp.entities.Rol;

import java.util.List;
import java.util.Set;

/**
 * Created by jn on 2/12/16.
 */
public class UsuarioDto implements BaseDto{
    private Integer id;
    private String numeroDocumento;
    private String nombreCompleto;
    private String email;
    private String usuario;
    private String password;
    private Rol rolPrincipal;
    private TipoDocumentoDto tipoDocumento;
    private Set<ProyectoDto> proyectosLiderados;
    private List<UsuarioRolEquipoDto> equipos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRolPrincipal() {
        return rolPrincipal;
    }

    public void setRolPrincipal(Rol rolPrincipal) {
        this.rolPrincipal = rolPrincipal;
    }

    public TipoDocumentoDto getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoDto tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Set<ProyectoDto> getProyectosLiderados() {
        return proyectosLiderados;
    }

    public void setProyectosLiderados(Set<ProyectoDto> proyectosLiderados) {
        this.proyectosLiderados = proyectosLiderados;
    }

    public List<UsuarioRolEquipoDto> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<UsuarioRolEquipoDto> equipos) {
        this.equipos = equipos;
    }


}
