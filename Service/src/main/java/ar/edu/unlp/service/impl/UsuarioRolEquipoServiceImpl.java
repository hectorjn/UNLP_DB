package ar.edu.unlp.service.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dto.UsuarioRolEquipoDto;
import ar.edu.unlp.entities.BaseEntity;
import ar.edu.unlp.service.interfaces.UsuarioRolEquipoService;

/**
 * Created by jn on 2/18/16.
 */
public class UsuarioRolEquipoServiceImpl extends BaseServiceImpl<UsuarioRolEquipoDto> implements UsuarioRolEquipoService<UsuarioRolEquipoDto> {

    public UsuarioRolEquipoServiceImpl() {
        super(UsuarioRolEquipoDto.class);
    }

    @Override
    protected BaseDao getDao() {
        return null;
    }

    public UsuarioRolEquipoDto save(UsuarioRolEquipoDto entity) {
        return null;
    }

    public void delete(UsuarioRolEquipoDto entity) {

    }

    public UsuarioRolEquipoDto update(UsuarioRolEquipoDto entity) {
        return null;
    }
}
