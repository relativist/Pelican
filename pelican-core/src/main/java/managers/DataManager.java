package managers;

import entities.Users;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DataManager {
    @PersistenceContext
    private EntityManager em;

    public String getNameUserById(Integer id) {
        String properySearch = "select o from Users o where o.id = :paramName";
        Users property = (Users) Utils.createCacheableQuery(em, properySearch)
                .setParameter("paramName", id)
                .getSingleResult();
        return property.getName();
    }
}
