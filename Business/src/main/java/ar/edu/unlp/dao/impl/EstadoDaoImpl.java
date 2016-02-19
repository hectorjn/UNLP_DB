package ar.edu.unlp.dao.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dao.interfaces.EstadoDao;
import ar.edu.unlp.entities.BaseEntity;
import ar.edu.unlp.entities.Equipo;
import ar.edu.unlp.entities.Estado;

/**
 * Created by jn on 2/18/16.
 */
public class EstadoDaoImpl extends BaseDaoImpl<Estado> implements EstadoDao<Estado> {

    public EstadoDaoImpl() {
        super(Equipo.class);
    }
}
