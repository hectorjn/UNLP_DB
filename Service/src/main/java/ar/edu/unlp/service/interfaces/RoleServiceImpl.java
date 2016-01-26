package ar.edu.unlp.service.interfaces;

import ar.edu.unlp.dao.interfaces.RoleDao;
import ar.edu.unlp.service.impl.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by jn on 1/24/16.
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    public RoleServiceImpl() {
    }

    public Collection getAll(){
        return roleDao.getAll();
    }
}
