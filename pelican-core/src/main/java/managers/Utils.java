package managers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class Utils {
    private static final Logger L = LoggerFactory.getLogger(Utils.class);
    public static Query createCacheableQuery(EntityManager em, String ql) {
        Query query = em.createQuery(ql);
        query.setHint("org.hibernate.cacheable", true);
        return query;
    }
}
