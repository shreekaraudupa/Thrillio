package com.semanticsquare.thrilio.managers;

import com.semanticsquare.thrilio.dao.UserDao;
import com.semanticsquare.thrilio.entities.User;

public class UserManager {
    private static UserManager userManagerInstance = new UserManager();
    private static UserDao userDao = new UserDao();

    public User[] getUsers(){
        return userDao.getUsers();
    }

    //Private constructor as others cant instantiate this class as we want to maintain Singleton
    private UserManager(){}

    //Only single instance should get initialized and that will be in this class itself
    public static UserManager getInstance(){
        return userManagerInstance;
    }

    public User createUser(long id , String email , String password , String firstName , String lastName , int gender , String userType){
        User user = new User();

        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setGender(gender);
        user.setUserType(userType);


        return user;
    }
}
