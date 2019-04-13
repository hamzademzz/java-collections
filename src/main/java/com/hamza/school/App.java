package com.hamza.school;

import com.hamza.school.logs.ConsoleLogger;
import com.hamza.school.logs.Logger;
import com.hamza.school.modules.MainModule;
import com.hamza.school.modules.Module;
import com.hamza.school.modules.StudentModule;
import com.hamza.school.modules.UserModule;
import com.hamza.school.repositories.users.UserFileRepository;
import com.hamza.school.repositories.users.UserRepository;
import com.hamza.school.utils.MyFileUtils;

import java.io.*;


public class App {

    public static void main(String[] args) throws IOException {

        String filePath= MyFileUtils.getUserFilePath("user-record.txt");
        UserRepository userRepository = new UserFileRepository(filePath);
        Logger logger=new ConsoleLogger();
        Module userModule = new UserModule(userRepository,logger);

        Module studentModule = new StudentModule();

        Module mainModule=new MainModule(userModule,studentModule);
        mainModule.showMenu();
    }

}




























     /*
        Menu :
            1: Users
            2: Students
            3: Exit

        Users:
            1: Add New
            2: List
            3: Find
            4: Update
            5: Delete
            6: Go Back (or Menu)
            7: Exit
*/


/**
 * GET FILE PATH
 * <p>
 * <p>
 * ADD USER
 */


//    private static String getUserFilePath() {
//        String resultFileName = "user-record.txt";
//        String resultFileLocation = System.getProperty("user.dir");
//        return resultFileLocation + File.separator + resultFileName;
//    }


/**
 *
 * ADD USER
 */

//    private static User inputUser() {
//        String firstName;
//        String lastName;
//        String userName;
//        String password;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter first name: ");
//        firstName = input.next();
//
//        System.out.println("Enter last name: ");
//        lastName = input.next();
//
//        System.out.println("Enter username: ");
//        userName = input.next();
//
//        System.out.println("Enter password");
//        password = input.next();
//        return new User(firstName, lastName, userName, password);
//    }

//    private static FileWriter addUser(String filePath, User user) throws IOException {
//        FileWriter fileWriter = new FileWriter(filePath, true);
//        addUser(fileWriter, user);
//        return fileWriter;
//    }
//
//    private static void addUser(FileWriter fileWriter, User user) throws IOException {
//        String row = user.getFirstName() + "," + user.getLastName() + "," + user.getUserName() + "," + user.getPassword();
//        fileWriter.write("\n");
//        fileWriter.write(row);
//    }



