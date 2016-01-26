package ar.edu.unlp;

import ar.edu.unlp.service.impl.RoleService;
import ar.edu.unlp.service.interfaces.RoleServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jn on 1/23/16.
 */
public class Runner {

    public static void main( String[] args ) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/Spring.xml");
        RoleService dao = appContext.getBean(RoleService.class);

        dao.getAll();


    }

    }
