/*
 * Created by Rohit Kumar Chandaluri on 2019.04.27  * 
 * Copyright © 2019 Rohit Kumar Chandaluri. All rights reserved. * 
 */
package edu.vt.FacadeBeans;

import edu.vt.EntityBeans.UserFile;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Rohit
 */
@Stateless
public class UserFileFacade extends AbstractFacade<UserFile> {

        /*
    Annotating 'private EntityManager em;' with '@PersistenceContext(unitName = "TeleMedicinePU")' implies that
    the EntityManager instance pointed to by 'em' is associated with the 'TeleMedicinePU' persistence context. 
    
    Here, Entity is the UserFile object. The persistence context is a set of entity (UserFile) instances in which
    for any persistent entity identity, there is a unique entity instance. 
    
    Within the persistence context, the entity instances and their life cycles are managed. The EntityManager API is used
    to create and remove persistent entity instances, to find entities by their primary key, and to query over entities.
     */
    @PersistenceContext(unitName = "TeleMedicinePU")
    private EntityManager em;

    // @Override annotation indicates that the super class AbstractFacade's getEntityManager() method is overridden.
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /*
     This constructor method invokes the parent abstract class AbstractFacade.java's 
     constructor method, which in turn initializes its entityClass instance variable
     with the UserFile class object reference returned by the UserFile.class. 
     */
    public UserFileFacade() {
        super(UserFile.class);
    }
    
    public UserFile getUserFile(int id) {
        return em.find(UserFile.class, id);
    }

    /*
    ======================================================
    The following methods are added to the generated code.
    ======================================================
     */
    /**
     *
     * @param primaryKey is the Primary Key of the user entity in the database
     * @return a list of object references of userFiles that belong to the user whose DB Primary Key = primaryKey
     */
    public List<UserFile> findUserFilesByUserPrimaryKey(Integer primaryKey) {
        /*
        The following @NamedQuery definition is given in UserFile.java entity class file:
        @NamedQuery(name = "UserFile.findUserFilesByUserId", query = "SELECT u FROM UserFile u WHERE u.userId.id = :userId")
        
        The following statement obtaines the results from the named database query.
         */
        List<UserFile> userFiles = em.createNamedQuery("UserFile.findUserFilesByUserId")
                .setParameter("userId", primaryKey)
                .getResultList();

        return userFiles;
    }

    /**
     *
     * @param file_name
     * @return a list of object references of userFiles with the name file_name
     */
    public List<UserFile> findByFilename(String file_name) {
        /*
        The following @NamedQuery definition is given in UserFile.java entity class file:
        @NamedQuery(name = "UserFile.findByFilename", query = "SELECT u FROM UserFile u WHERE u.filename = :filename")
        
        The following statement obtaines the results from the named database query.
         */
        List<UserFile> files = em.createNamedQuery("UserFile.findByFilename")
                .setParameter("filename", file_name)
                .getResultList();

        return files;
    }

}
