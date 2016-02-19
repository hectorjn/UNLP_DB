package ar.edu.unlp.dao.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dao.interfaces.UsuarioDao;
import ar.edu.unlp.entities.BaseEntity;
import ar.edu.unlp.entities.Usuario;

/**
 * Created by jn on 2/18/16.
 */
public class UsuarioRolEquipoDaoImpl extends BaseDaoImpl<Usuario> implements UsuarioDao<Usuario> {

    public UsuarioRolEquipoDaoImpl() {
        super(Usuario.class);
    }
}
