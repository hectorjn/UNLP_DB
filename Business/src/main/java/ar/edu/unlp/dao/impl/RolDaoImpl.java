package ar.edu.unlp.dao.impl;

import ar.edu.unlp.dao.interfaces.RoleDao;
import ar.edu.unlp.entities.Rol;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by jn on 1/23/16.
 */
@Repository
public class RolDaoImpl extends BaseDaoImpl<Rol> implements RoleDao {

    public RolDaoImpl() {
        super(Rol.class);
    }

    @Override
    public Rol getByPrimaryKey(Serializable key) {
        return null;
    }
}
