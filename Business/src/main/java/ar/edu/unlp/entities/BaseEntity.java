package ar.edu.unlp.entities;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * Created by jn on 1/24/16.
 */
public abstract class BaseEntity implements Serializable  {

    @Transient
    public abstract Serializable getPrimaryKey();


}
