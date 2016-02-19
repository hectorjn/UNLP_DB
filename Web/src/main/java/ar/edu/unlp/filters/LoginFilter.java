package ar.edu.unlp.filters;

import ar.edu.unlp.jsf.beans.LoginBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jn on 2/17/16.
 */
public class LoginFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginFilter.class);
    private static final String LOGIN_PAGE = "/pages/public/login.jsf";

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        LoginBean loginBean = (LoginBean)((HttpServletRequest)request).getSession().getAttribute("loginBean");

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;


        if (loginBean != null) {
            if (loginBean.isLoggedIn()) {
                LOGGER.debug("user is logged in");
                // user is logged in, continue request
                chain.doFilter(httpServletRequest, httpServletResponse);
            } else {
                LOGGER.debug("user is not logged in");
                // user is not logged in, redirect to login page
                httpServletResponse.sendRedirect(httpServletRequest
                        .getContextPath() + LOGIN_PAGE);
            }
        } else {
            LOGGER.debug("userManager not found");
            // user is not logged in, redirect to login page
            httpServletResponse.sendRedirect(httpServletRequest
                    .getContextPath() + LOGIN_PAGE);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
