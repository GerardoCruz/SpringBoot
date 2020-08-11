package com.gerardo.users.Service;

import java.util.List;

import com.gerardo.users.DAO.UserDAO;
import com.gerardo.users.Entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

//Business
@Service
public class UserService {
    
    @Autowired 
    UserDAO userDAO;

    public List<User> findAll(){
        return userDAO.findAll();
    }

    public User findById(int id){
        return userDAO.findById(id);
    }

    public void saveUser(User user){
        userDAO.saveUser(user);
    }
}