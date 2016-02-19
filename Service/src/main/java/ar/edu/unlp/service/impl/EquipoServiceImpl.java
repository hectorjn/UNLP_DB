package ar.edu.unlp.service.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dto.BaseDto;
import ar.edu.unlp.dto.EquipoDto;
import ar.edu.unlp.service.interfaces.BaseService;
import ar.edu.unlp.service.interfaces.EquipoService;

/**
 * Created by jn on 2/17/16.
 */
public class EquipoServiceImpl  extends BaseServiceImpl<EquipoDto> implements EquipoService<EquipoDto> {

    public EquipoServiceImpl() {
        super(EquipoDto.class);
    }

    @Override
    protected BaseDao getDao() {
        return null;
    }

    public EquipoDto save(EquipoDto entity) {
        return null;
    }

    public void delete(EquipoDto entity) {

    }

    public EquipoDto update(EquipoDto entity) {
        return null;
    }
}

