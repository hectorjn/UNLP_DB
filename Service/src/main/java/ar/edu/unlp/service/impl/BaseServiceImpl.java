package ar.edu.unlp.service.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dto.BaseDto;
import ar.edu.unlp.entities.BaseEntity;
import ar.edu.unlp.service.interfaces.BaseService;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jn on 2/16/16.
 */
public abstract class BaseServiceImpl <DTO extends BaseDto>  implements BaseService<DTO> {

    private final Class<DTO> type;

    public BaseServiceImpl(Class<DTO> type) {
        this.type = type;
    }

    protected ModelMapper getMapper(){
        return  new ModelMapper();
    }

    protected abstract BaseDao getDao();

    public List<DTO> getAll() {
        List<? extends BaseEntity> listEntities = getDao().getAll();
        List<DTO> listDtos = new ArrayList<DTO>();
        for (BaseEntity entity  :listEntities) {
            listDtos.add(getMapper().map(entity, type));

        }
        return listDtos;
    }

    public DTO getByPrimaryKey(Serializable key) {
        BaseEntity entity = getDao().getByPrimaryKey(key);
        DTO dto = getMapper().map(entity, type);
        return dto;
    }
}
