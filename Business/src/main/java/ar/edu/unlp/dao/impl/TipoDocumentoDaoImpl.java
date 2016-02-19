package ar.edu.unlp.dao.impl;

import ar.edu.unlp.dao.interfaces.BaseDao;
import ar.edu.unlp.dao.interfaces.TipoDocumentoDao;
import ar.edu.unlp.entities.BaseEntity;
import ar.edu.unlp.entities.TipoDocumento;

/**
 * Created by jn on 2/18/16.
 */
public class TipoDocumentoDaoImpl extends BaseDaoImpl<TipoDocumento> implements TipoDocumentoDao<TipoDocumento> {

    public TipoDocumentoDaoImpl() {
        super(TipoDocumento.class);
    }
}
