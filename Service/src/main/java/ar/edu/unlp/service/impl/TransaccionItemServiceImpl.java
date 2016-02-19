package ar.edu.unlp.service.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dto.BaseDto;
import ar.edu.unlp.dto.TransicionItemDto;
import ar.edu.unlp.service.interfaces.BaseService;
import ar.edu.unlp.service.interfaces.TransaccionItemService;

/**
 * Created by jn on 2/18/16.
 */
public class TransaccionItemServiceImpl extends BaseServiceImpl<TransicionItemDto> implements TransaccionItemService<TransicionItemDto>{

    public TransaccionItemServiceImpl() {
        super(TransicionItemDto.class);
    }

    @Override
    protected BaseDao getDao() {
        return null;
    }

    public TransicionItemDto save(TransicionItemDto entity) {
        return null;
    }

    public void delete(TransicionItemDto entity) {

    }

    public TransicionItemDto update(TransicionItemDto entity) {
        return null;
    }
}
