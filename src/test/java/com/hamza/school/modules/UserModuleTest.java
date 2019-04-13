package com.hamza.school.modules;

import com.hamza.school.domain.User;
import com.hamza.school.logs.Logger;
import com.hamza.school.repositories.users.UserRepository;
import org.junit.Test;

import java.io.FileNotFoundException;
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
    public void update() throws FileNotFoundException {

        User user=mock(User.class);

        UserRepository userRepository =mock(UserRepository.class);

        Logger logger=mock(Logger.class);

        UserModule userModule = new UserModule(userRepository,logger);
        userModule.update();

        when(userRepository.get(logger.scanNext())).thenReturn(user);
        userRepository.update(user);

        verify(userRepository,times(1)).update(user);


    }

    @Test
    public void delete(){
        User user= mock(User.class);

        UserRepository userRepository = mock(UserRepository.class);

        Logger logger = mock(Logger.class);

        UserModule userModule = new UserModule(userRepository,logger);
        userModule.delete();

        when(userRepository.get(logger.scanNext())).thenReturn(user);
        userRepository.get(String.valueOf(user));

        verify(userRepository,times(1)).get(String.valueOf(user));

    }

    @Test
    public void find(){

        User user= mock(User.class);

        UserRepository userRepository = mock(UserRepository.class);

        Logger logger = mock(Logger.class);

        UserModule userModule = new UserModule(userRepository,logger);
        userModule.find();

        when(userRepository.get(logger.scanNext())).thenReturn(user);
        userRepository.get(String.valueOf(user));

        verify(userRepository,times(1)).get(String.valueOf(user));



    }



}