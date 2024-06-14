package com.mycompany.jaxrs_jpa_login.resources;

import com.mycompany.jpa.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import java.util.List;

/**
 *
 * @author 
 */
@Path("jakartaee10")
public class JakartaEE10Resource {
    
    @GET
    @Path("ping")
    public Response ping(){
        return Response
                .ok("ping Jakarta EE / XX")
                .build();
    }
    
    @GET
    @Path("query")
    public Response query(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_jndi_user_db");
        System.out.println("emf.isOpen: " + emf.isOpen()) ;
        System.out.println("################## HI 1 ################### ");
        
        EntityManager em = emf.createEntityManager();
        System.out.println("em.isOpen: " + em.isOpen()) ;
        System.out.println("################## HI 2 ################### ");
        
        //System.out.println("XXX: " + em.find(User.class, "alice")) ;
        
        
        
        //System.out.println(em.createQuery("SELECT u from user u", User.class).getResultList());
        
        /*TypedQuery<User> query = em.createQuery("SELECT u FROM User u", User.class);
        List<User> results = query.getResultList();
        System.out.println("################## HI 3 ################### ");
        for (User u : results) {
            System.out.println(u);
        }
        System.out.println("################## HI 4 ################### ");

        for (User u: results) {
            System.out.println(u.getUserID() + " " + u.getPassword());
        }
        System.out.println("################## HI 6 ################### ");
        */
        
        return Response
                .ok("hehe")
                .build();
    }
}
