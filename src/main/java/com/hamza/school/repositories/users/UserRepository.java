package com.hamza.school.repositories.users;

import com.hamza.school.domain.User;

import java.io.FileNotFoundException;
import java.util.List;

public interface UserRepository {

    List<User> getAll();

    User get(String id);

    void add(User user);

    void update(User user) throws FileNotFoundException;

    boolean delete(String id);

    boolean changePassword(String username,String oldPassword,String newPassword,String newPassword2);

    boolean authenticate(String username, String password);

}


