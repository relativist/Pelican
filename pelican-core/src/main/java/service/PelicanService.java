package service;

import managers.DataManager;
import managers.Error;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static javax.ws.rs.core.Response.status;

@Path("/example")
@Stateless
public class PelicanService {
    private static final Logger L = LoggerFactory.getLogger(PelicanService.class);
    @PersistenceContext
    private EntityManager em;

    @EJB
    private DataManager dataManager;

    @GET
    @Path("test")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getUpdateCseGeo() {
        try {
            L.info("GET: scm geo");
            return Response.ok(dataManager.getNameUserById(1)).build();
//            return Response.ok(dDeliveryManager.updateDeliveryPoints()).build();
        } catch (WebApplicationException e) {
            L.debug("", e);
            return e.getResponse();
        } catch (EntityNotFoundException | NoResultException e) {
            L.debug("", e);
            return status(NOT_FOUND).entity(new Error(e.getMessage(), NOT_FOUND.getStatusCode())).build();
        } catch (Exception e) {
            L.error("", e);
            int status = INTERNAL_SERVER_ERROR.getStatusCode();
            return status(status).entity(new Error(e.getMessage(), status)).build();
        } finally {
            L.debug("findPricelistOffer -> done");
        }
    }

}
