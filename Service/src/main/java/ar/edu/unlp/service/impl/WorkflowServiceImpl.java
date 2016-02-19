package ar.edu.unlp.service.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dto.BaseDto;
import ar.edu.unlp.dto.WorkFlowDto;
import ar.edu.unlp.service.interfaces.BaseService;
import ar.edu.unlp.service.interfaces.WorkflowService;

/**
 * Created by jn on 2/18/16.
 */
public class WorkflowServiceImpl extends BaseServiceImpl<WorkFlowDto> implements WorkflowService<WorkFlowDto>{

    public WorkflowServiceImpl() {
        super(WorkFlowDto.class);
    }

    @Override
    protected BaseDao getDao() {
        return null;
    }

    public WorkFlowDto save(WorkFlowDto entity) {
        return null;
    }

    public void delete(WorkFlowDto entity) {

    }

    public WorkFlowDto update(WorkFlowDto entity) {
        return null;
    }
}
