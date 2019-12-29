package mygroup.crudproj.service;

import mygroup.crudproj.model.User;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import java.util.List;

public class UserServiceEntityManager implements UserService {

    @PersistenceContext
    EntityManagerFactory emf;
    EntityManager em;
    @Resource
    UserTransaction utx;


    @Override
    public List<User> allUsers() {
        em = emf.createEntityManager();
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void edit(User user) {

    }

    @Override
    public User getUserById(Long id) {
        return null;
    }
}
