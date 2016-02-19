package ar.edu.unlp.dao.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.entities.BaseEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jn on 1/24/16.
 */
@Transactional
public abstract class BaseDaoImpl<T extends BaseEntity> implements BaseDao<T> {

    @Autowired
    private SessionFactory sessionFactory;

    private Class type;

    public BaseDaoImpl(Class type ){
        this.type = type;
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public T save(T entity) {
        getSession().save(entity);
        return entity;
    }

    public void delete(T entity) {
        getSession().delete(entity);
    }

    /*/Unchecked*/
    public List<T> getAll() {
        return (List<T>) getSession().createCriteria(this.type).list();

    }

    public  T getByPrimaryKey(Serializable key){
        return (T) getSession().get(this.type,key);
    }

    public T update(T entity) {
        getSession().update(entity);
        return entity;
    }
}
