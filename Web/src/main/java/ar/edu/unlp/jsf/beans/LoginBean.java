package ar.edu.unlp.jsf.beans;

import ar.edu.unlp.BaseJsfBean;
import ar.edu.unlp.dto.RolDto;
import ar.edu.unlp.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.util.List;

/**
 * Created by jn on 2/16/16.
 */

@Component(value = "loginBean")
@SessionScoped
public class LoginBean extends BaseJsfBean {


    @Autowired
    private RoleService roleService;

    private boolean loggedIn;

    public List getRoles(){
        return roleService.getAll();
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String logout() {
       // String identifier = userId;

        // invalidate the session
        //LOGGER.debug("invalidating session for '{}'", identifier);

        getExternalContext().invalidateSession();

        //LOGGER.info("logout successful for '{}'", identifier);
        return LOGOUT_PAGE_REDIRECT;
    }

}
