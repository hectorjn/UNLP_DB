package ar.edu.unlp.service.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dto.BaseDto;
import ar.edu.unlp.dto.ProyectoDto;
import ar.edu.unlp.service.interfaces.BaseService;
import ar.edu.unlp.service.interfaces.ProyectoService;

/**
 * Created by jn on 2/18/16.
 */
public class ProyectoServiceImpl extends BaseServiceImpl<ProyectoDto> implements ProyectoService<ProyectoDto> {


    public ProyectoServiceImpl() {
        super(ProyectoDto.class);
    }

    @Override
    protected BaseDao getDao() {
        return null;
    }

    public ProyectoDto save(ProyectoDto entity) {
        return null;
    }

    public void delete(ProyectoDto entity) {

    }

    public ProyectoDto update(ProyectoDto entity) {
        return null;
    }
}
