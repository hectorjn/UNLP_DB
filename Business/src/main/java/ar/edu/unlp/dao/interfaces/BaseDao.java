package ar.edu.unlp.dao.interfaces;

import ar.edu.unlp.entities.BaseEntity;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jn on 1/24/16.
 */
public interface  BaseDao<T extends BaseEntity> {

    public Session getSession();

    public T save(T entity);

    public void delete(T entity);

    public List<T> getAll();

    public T getByPrimaryKey(Serializable key);

    public T update(T entity);


}
