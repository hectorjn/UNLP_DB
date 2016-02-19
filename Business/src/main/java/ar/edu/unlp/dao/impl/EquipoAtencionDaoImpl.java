package ar.edu.unlp.dao.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dao.interfaces.EquipoAtencionDao;
import ar.edu.unlp.entities.BaseEntity;
import ar.edu.unlp.entities.EquipoAtencion;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jn on 2/18/16.
 */

@Transactional
@Repository
public class EquipoAtencionDaoImpl extends BaseDaoImpl<EquipoAtencion> implements EquipoAtencionDao<EquipoAtencion> {

    public EquipoAtencionDaoImpl() {
        super(EquipoAtencion.class);
    }
}
