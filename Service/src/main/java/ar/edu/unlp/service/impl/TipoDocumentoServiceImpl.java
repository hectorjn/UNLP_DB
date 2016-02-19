package ar.edu.unlp.service.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dto.BaseDto;
import ar.edu.unlp.dto.TipoDocumentoDto;
import ar.edu.unlp.service.interfaces.BaseService;
import ar.edu.unlp.service.interfaces.TipoDocumentoService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jn on 2/18/16.
 */
public class TipoDocumentoServiceImpl extends BaseServiceImpl<TipoDocumentoDto> implements TipoDocumentoService<TipoDocumentoDto>{

    public TipoDocumentoServiceImpl() {
        super(TipoDocumentoDto.class);
    }

    @Override
    protected BaseDao getDao() {
        return null;
    }

    public TipoDocumentoDto save(TipoDocumentoDto entity) {
        return null;
    }

    public void delete(TipoDocumentoDto entity) {

    }

    public TipoDocumentoDto update(TipoDocumentoDto entity) {
        return null;
    }
}
