package ar.edu.unlp.service.impl;

import ar.edu.unlp.dao.impl.BaseDaoImpl;
import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dto.TipoItemDto;
import ar.edu.unlp.service.interfaces.TipoItemService;
import org.hibernate.Session;

/**
 * Created by jn on 2/18/16.
 */
public class TipoItemServiceImpl extends BaseServiceImpl<TipoItemDto> implements TipoItemService<TipoItemDto> {

    public TipoItemServiceImpl() {
        super(TipoItemDto.class);
    }

    public Session getSession() {
        return null;
    }

    @Override
    protected BaseDao getDao() {
        return null;
    }

    public TipoItemDto save(TipoItemDto entity) {
        return null;
    }

    public void delete(TipoItemDto entity) {

    }

    public TipoItemDto update(TipoItemDto entity) {
        return null;
    }
}
