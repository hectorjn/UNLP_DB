package ar.edu.unlp.service.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dao.interfaces.RoleDao;
import ar.edu.unlp.dto.RolDto;
import ar.edu.unlp.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by jn on 1/24/16.
 */
@Service
@Transactional
public class RoleServiceImpl extends BaseServiceImpl<RolDto> implements RoleService<RolDto>{

    @Autowired
    private RoleDao roleDao;

    public RoleServiceImpl() {
        super(RolDto.class);
    }

    @Override
    protected BaseDao getDao() {
        return roleDao;
    }

    public RolDto save(RolDto entity) {
        return null;
    }

    public void delete(RolDto entity) {

    }

    public RolDto update(RolDto entity) {
        return null;
    }
}
