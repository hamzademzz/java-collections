package com.hamza.school.modules;

import com.hamza.school.domain.User;
import com.hamza.school.logs.Logger;
import com.hamza.school.repositories.users.UserRepository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class UserModule implements Module {
    private final UserRepository userRepository;
    private Logger logger;

    public UserModule(UserRepository userRepository, Logger logger) {
        this.userRepository = userRepository;
        this.logger = logger;
    }

    public void showMenu() throws IOException {
        logger.clearScreen();
        Integer selectedOption;
        boolean continueToProcess = true;

        do {
            logger.printLine("1-) Add");
            logger.printLine("2-) List");
            logger.printLine("3-) Find");
            logger.printLine("4-) Update");
            logger.printLine("5-) Delete");
            logger.printLine("6-) Main Menu");
            logger.printLine("7-) Exit");
            selectedOption = logger.nextInt();
            switch (selectedOption) {
                case 1:
                    add();
                    break;
                case 2:
                    list();
                    break;
                case 3:
                    find();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    continueToProcess = false;
                    break;
                case 7:
                    logger.exit();
                    break;
            }

        } while (continueToProcess);
    }

    public void add() throws IOException {
        User user = userRepository.inputUser();
        userRepository.add(user);
    }


    public void list() {
        List<User> all = userRepository.getAll();
        for (int i = 0; i < all.size(); i++) {
            User user = all.get(i);
            logger.printLine(user.getUserName());
        }
    }

    public void find() {
        logger.printLine("Enter the username of the user you want to find : ");
        String id = logger.scanNext();
        logger.printLine("User Search : " + userRepository.get(id));

    }

    public void update() {
        logger.printLine("Enter the username of the user you want to update : ");
        User user = userRepository.get(logger.scanNext());
        try {
            userRepository.update(user);
        }catch(FileNotFoundException exception){
            logger.printLine(exception.getMessage());
        }
    }

    public void delete() {
        logger.printLine("Enter the username of want to delete : ");
        String id = logger.scanNext();
        userRepository.delete(id);

    }
}
