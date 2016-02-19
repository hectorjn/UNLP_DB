package ar.edu.unlp.service.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dto.BaseDto;
import ar.edu.unlp.dto.EstadoDto;
import ar.edu.unlp.service.interfaces.BaseService;
import ar.edu.unlp.service.interfaces.EstadoService;

/**
 * Created by jn on 2/18/16.
 */
public class EstadoServiceImpl extends BaseServiceImpl<EstadoDto> implements EstadoService<EstadoDto>{


    public EstadoServiceImpl() {
        super(EstadoDto.class);
    }

    @Override
    protected BaseDao getDao() {
        return null;
    }

    public EstadoDto save(EstadoDto entity) {
        return null;
    }

    public void delete(EstadoDto entity) {

    }

    public EstadoDto update(EstadoDto entity) {
        return null;
    }
}
