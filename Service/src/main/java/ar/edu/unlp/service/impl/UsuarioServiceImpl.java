package ar.edu.unlp.service.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dto.BaseDto;
import ar.edu.unlp.dto.UsuarioDto;
import ar.edu.unlp.entities.Usuario;
import ar.edu.unlp.service.interfaces.BaseService;
import ar.edu.unlp.service.interfaces.UsuarioService;

/**
 * Created by jn on 2/18/16.
 */
public class UsuarioServiceImpl extends BaseServiceImpl<UsuarioDto> implements UsuarioService<UsuarioDto>{

    public UsuarioServiceImpl() {
        super(UsuarioDto.class);
    }

    @Override
    protected BaseDao getDao() {
        return null;
    }

    public UsuarioDto save(UsuarioDto entity) {
        return null;
    }

    public void delete(UsuarioDto entity) {

    }

    public UsuarioDto update(UsuarioDto entity) {
        return null;
    }
}
