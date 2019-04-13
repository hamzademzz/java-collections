package com.hamza.school.modules;

import com.hamza.school.domain.User;
import com.hamza.school.logs.Logger;
import com.hamza.school.repositories.users.UserRepository;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UserModuleTest {

    @Test
    public void add() throws Exception {

        User user=mock(User.class);

        UserRepository userRepository =mock(UserRepository.class);
        when(userRepository.inputUser()).thenReturn(user);

        Logger logger=mock(Logger.class);

        UserModule userModule = new UserModule(userRepository,logger);
        userModule.add();

        verify(userRepository,times(1)).inputUser();
        verify(userRepository,times(1)).add(user);
    }


    @Test
    public void list(){
        Logger logger=mock(Logger.class);
        doNothing().when(logger).printLine(isA(String.class));

        User user=mock(User.class);
        when(user.getUserName()).thenReturn("MyUserName");

        List<User> users= Arrays.asList(user);
        UserRepository userRepository =mock(UserRepository.class);
        when(userRepository.getAll()).thenReturn(users);

        UserModule userModule = new UserModule(userRepository,logger);
        userModule.list();

        verify(logger,times(1)).printLine("MyUserName");
        verify(user,times(1)).getUserName();
    }

    @Test
    public void find(){

    }


    @Test
    public void update(){

    }

    @Test
    public void delete(){

        User user=mock(User.class);

        UserRepository userRepository =mock(UserRepository.class);
        when(userRepository.delete("Test")).thenReturn(true);

        Logger logger=mock(Logger.class);

        UserModule userModule = new UserModule(userRepository,logger);
        userModule.delete();

        verify(userRepository,times(1)).delete("Test");




    }

}