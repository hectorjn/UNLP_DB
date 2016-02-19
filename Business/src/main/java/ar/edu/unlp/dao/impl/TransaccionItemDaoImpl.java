package ar.edu.unlp.dao.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dao.interfaces.TipoDocumentoDao;
import ar.edu.unlp.entities.BaseEntity;
import ar.edu.unlp.entities.TransicionItem;

/**
 * Created by jn on 2/18/16.
 */
public class TransaccionItemDaoImpl extends BaseDaoImpl<TransicionItem> implements TipoDocumentoDao<TransicionItem> {

    public TransaccionItemDaoImpl() {
        super(TransicionItem.class);
    }
}
