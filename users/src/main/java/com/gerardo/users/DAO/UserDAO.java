package com.gerardo.users.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.gerardo.users.Entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//Facade
@Repository
public class UserDAO{
    
    @Autowired 
    EntityManager entityManager;

    
    public List<User> findAll(){   
        List<User>  listUsers = entityManager.createQuery("SELECT u.user FROM User u").getResultList();
        return listUsers;
    }

    
    public User findById(int id) {
        List<User> user = entityManager.createQuery("SELECT u FROM User u WHERE u.id = :id").setParameter("id", id).getResultList();
        return user.size() == 0 ? null : user.get(0);
    }
    
    @Transactional
    public void saveUser(User user){
        entityManager.persist(user);
        entityManager.flush();
    }
}