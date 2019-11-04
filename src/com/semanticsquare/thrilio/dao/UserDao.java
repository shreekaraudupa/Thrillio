package com.semanticsquare.thrilio.dao;

import com.semanticsquare.thrilio.DataStore;
import com.semanticsquare.thrilio.entities.User;

public class UserDao {
    public User[] getUsers(){
        return DataStore.getUsers();
    }
}
