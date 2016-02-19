package ar.edu.unlp;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * Created by jn on 2/16/16.
 */
public abstract class BaseJsfBean {

    protected static final String LOGOUT_PAGE_REDIRECT = "/pages/public/login.jsf";
    protected static final String LOGIN_PAGE = "/pages/public/login.jsf";

    protected ExternalContext getExternalContext(){
        return FacesContext.getCurrentInstance().getExternalContext();
    }
}
