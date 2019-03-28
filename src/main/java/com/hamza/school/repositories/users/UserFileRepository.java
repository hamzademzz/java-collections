package com.hamza.school.repositories.users;

import com.hamza.school.domain.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserFileRepository implements UserRepository {


    public List<User> users = null;
    private final String filePath;

    public UserFileRepository(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<User> getAll() {
        File file = new File(filePath);
        if (users == null || users.isEmpty()) {
            try {
                users = readUsers(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                users=new ArrayList<>();
            }
        }
        System.out.println(users.toString());
        return users;
    }

    @Override
    public User get(String id) {
        List<User> users = getAll();
        User foundUser = null;
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getUserName().equals(id)) {
                foundUser = user;
                break;
            }
        }

        return foundUser;

    }

    @Override
    public void add(User user) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(user);
    }

    @Override
    public void update(User user) {
        String newFirstName;
        String newLastName;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new First Name");
        newFirstName = input.nextLine();
        System.out.println("Enter new Last Name");
        newLastName = input.nextLine();

        User foundUser = get(user.getUserName());
        if (user != null) {
            foundUser.setFirstName(newFirstName);
            foundUser.setLastName(newLastName);
        }
        System.out.println(user);
    }


    @Override
    public boolean delete(String id) {
        User foundUser = get(id);
        if (foundUser != null) {
            this.users.remove(foundUser);
            System.out.println(users);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean changePassword(String username,String oldPassword,String newPassword,String newPassword2) {
        if(!newPassword.equals(newPassword2)){
            return false;
        }
        User user=get(username);
        if(user!=null && user.getPassword().equals(oldPassword)){
            user.setPassword(newPassword);
            return true;
        }else{
            return false;
        }
    }


    @Override
    public boolean authenticate(String username, String password) {
        User user=get(username);
        if(user!=null && user.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }

    private List<User> readUsers(File file) throws FileNotFoundException {
        List<User> users = new ArrayList<>();
        Scanner sc = new Scanner(file);

        try {
            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();
                if (nextLine.length() >= 4) {
                    String[] fields = nextLine.split(",");
                    String firstName = fields[0];
                    String lastName = fields[1];
                    String userName = fields[2];
                    String password = fields[3];
                    User user = new User(firstName, lastName, userName, password);
                    users.add(user);
                } else {
                    System.out.print("corrupted line :");
                    System.out.println(nextLine);
                }
            }

        } catch (NumberFormatException exp) {
            System.out.println(exp.getMessage());
        } finally {
            sc.close();
        }
        return users;
    }

    public User inputUser() {
        String firstName;
        String lastName;
        String userName;
        String password;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        firstName = input.next();

        System.out.println("Enter last name: ");
        lastName = input.next();

        System.out.println("Enter username: ");
        userName = input.next();

        System.out.println("Enter password");
        password = input.next();
        return new User(firstName, lastName, userName, password);
    }

//    public static FileWriter addUser(String filePath, User user) throws IOException {
//        FileWriter fileWriter = new FileWriter(filePath, true);
//        addUser(fileWriter, user);
//        return fileWriter;
//    }

    public static void addUser(FileWriter fileWriter, User user) throws IOException {
        String row = user.getFirstName() + "," + user.getLastName() + "," + user.getUserName() + "," + user.getPassword();
        fileWriter.write("\n");
        fileWriter.write(row);
        fileWriter.close();
    }
}
