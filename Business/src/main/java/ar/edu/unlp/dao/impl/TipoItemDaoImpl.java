package ar.edu.unlp.dao.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dao.interfaces.TipoItemDao;
import ar.edu.unlp.entities.BaseEntity;
import ar.edu.unlp.entities.TipoItem;

/**
 * Created by jn on 2/18/16.
 */
public class TipoItemDaoImpl extends BaseDaoImpl<TipoItem> implements TipoItemDao<TipoItem>{

    public TipoItemDaoImpl() {
        super(TipoItem.class);
    }
}
