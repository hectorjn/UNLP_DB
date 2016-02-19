package ar.edu.unlp.dao.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dao.interfaces.EquipoDao;
import ar.edu.unlp.entities.BaseEntity;
import ar.edu.unlp.entities.Equipo;

/**
 * Created by jn on 2/17/16.
 */
public class EquipoDaoImpl extends BaseDaoImpl<Equipo>  implements EquipoDao<Equipo> {

    public EquipoDaoImpl() {
        super(Equipo.class);
    }
}

