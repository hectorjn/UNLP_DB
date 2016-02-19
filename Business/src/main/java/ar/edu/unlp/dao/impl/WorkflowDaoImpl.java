package ar.edu.unlp.dao.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dao.interfaces.WorkflowDao;
import ar.edu.unlp.entities.BaseEntity;
import ar.edu.unlp.entities.WorkFlow;

/**
 * Created by jn on 2/18/16.
 */
public class WorkflowDaoImpl extends BaseDaoImpl<WorkFlow> implements WorkflowDao<WorkFlow> {

    public WorkflowDaoImpl() {
        super(WorkFlow.class);
    }
}
