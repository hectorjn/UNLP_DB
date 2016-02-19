package ar.edu.unlp.entities;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by jn on 2/12/16.
 */
public class Usuario extends BaseEntity{
    private Integer id;
    private String numeroDocumento;
    private String nombreCompleto;
    private String email;
    private String usuario;
    private String password;
    private Rol rolPrincipal;
    private TipoDocumento tipoDocumento;
    private Set<Proyecto> proyectosLiderados;
    private List<UsuarioRolEquipo> equipos;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario1 = (Usuario) o;

        if (id != null ? !id.equals(usuario1.id) : usuario1.id != null) return false;
        if (numeroDocumento != null ? !numeroDocumento.equals(usuario1.numeroDocumento) : usuario1.numeroDocumento != null)
            return false;
        if (nombreCompleto != null ? !nombreCompleto.equals(usuario1.nombreCompleto) : usuario1.nombreCompleto != null)
            return false;
        if (email != null ? !email.equals(usuario1.email) : usuario1.email != null) return false;
        if (usuario != null ? !usuario.equals(usuario1.usuario) : usuario1.usuario != null) return false;
        if (password != null ? !password.equals(usuario1.password) : usuario1.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        result = 31 * result + (nombreCompleto != null ? nombreCompleto.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (usuario != null ? usuario.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    public Rol getRolPrincipal() {
        return rolPrincipal;
    }

    public void setRolPrincipal(Rol rolPrincipal) {
        this.rolPrincipal = rolPrincipal;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Set<Proyecto> getProyectosLiderados() {
        return proyectosLiderados;
    }

    public void setProyectosLiderados(Set<Proyecto> proyectosLiderados) {
        this.proyectosLiderados = proyectosLiderados;
    }

    public List<UsuarioRolEquipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<UsuarioRolEquipo> equipos) {
        this.equipos = equipos;
    }


    @Override
    @Transient
    public Serializable getPrimaryKey() {
        return id;
    }
}
