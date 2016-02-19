package ar.edu.unlp.service.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dto.EquipoAtencionDto;
import ar.edu.unlp.service.interfaces.EquipoAtencionService;

/**
 * Created by jn on 2/18/16.
 */
public class EquipoAtencionServiceImpl extends BaseServiceImpl<EquipoAtencionDto> implements EquipoAtencionService<EquipoAtencionDto> {


    public EquipoAtencionServiceImpl() {
        super(EquipoAtencionDto.class);
    }

    @Override
    protected BaseDao getDao() {
        return null;
    }

    public EquipoAtencionDto save(EquipoAtencionDto entity) {
        return null;
    }

    public void delete(EquipoAtencionDto entity) {

    }

    public EquipoAtencionDto update(EquipoAtencionDto entity) {
        return null;
    }
}
