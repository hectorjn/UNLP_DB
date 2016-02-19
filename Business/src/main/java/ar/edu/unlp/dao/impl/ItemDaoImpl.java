package ar.edu.unlp.dao.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dao.interfaces.ItemDao;
import ar.edu.unlp.entities.BaseEntity;
import ar.edu.unlp.entities.Item;

/**
 * Created by jn on 2/18/16.
 */
public class ItemDaoImpl extends BaseDaoImpl<Item> implements ItemDao<Item> {

    public ItemDaoImpl() {
        super(Item.class);
    }
}
