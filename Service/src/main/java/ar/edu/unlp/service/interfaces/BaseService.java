package ar.edu.unlp.service.interfaces;

import ar.edu.unlp.dto.BaseDto;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jn on 2/16/16.
 */
public interface BaseService <DTO extends BaseDto>{

    public DTO save(DTO entity);

    public void delete(DTO entity);

    public List<DTO> getAll();

    public DTO getByPrimaryKey(Serializable key);

    public DTO update(DTO entity);

}
