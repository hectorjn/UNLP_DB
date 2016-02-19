package ar.edu.unlp.dao.impl;

import ar.edu.unlp.dao.interfaces.RoleDao;
import ar.edu.unlp.entities.Rol;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * Created by jn on 1/23/16.
 */
@Transactional
@Repository
public class RolDaoImpl  extends  BaseDaoImpl<Rol> implements RoleDao<Rol>{

   public RolDaoImpl() {
        super(Rol.class);
    }

}
