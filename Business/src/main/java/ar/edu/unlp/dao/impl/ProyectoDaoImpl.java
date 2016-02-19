package ar.edu.unlp.dao.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dao.interfaces.ProyectoDao;
import ar.edu.unlp.entities.BaseEntity;
import ar.edu.unlp.entities.Proyecto;

/**
 * Created by jn on 2/18/16.
 */
public class ProyectoDaoImpl extends BaseDaoImpl<Proyecto> implements ProyectoDao<Proyecto> {

    public ProyectoDaoImpl() {
        super(Proyecto.class);
    }
}
