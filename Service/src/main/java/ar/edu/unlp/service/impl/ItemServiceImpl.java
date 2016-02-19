package ar.edu.unlp.service.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dto.BaseDto;
import ar.edu.unlp.dto.ItemDto;
import ar.edu.unlp.service.interfaces.BaseService;
import ar.edu.unlp.service.interfaces.ItemService;

/**
 * Created by jn on 2/18/16.
 */
public class ItemServiceImpl extends BaseServiceImpl<ItemDto>  implements ItemService<ItemDto> {

    public ItemServiceImpl(Class<ItemDto> type) {
        super(type);
    }

    @Override
    protected BaseDao getDao() {
        return null;
    }

    public ItemDto save(ItemDto entity) {
        return null;
    }

    public void delete(ItemDto entity) {

    }

    public ItemDto update(ItemDto entity) {
        return null;
    }
}
