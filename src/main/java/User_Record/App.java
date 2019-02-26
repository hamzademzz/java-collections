package User_Record;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {

    public static void main(String[] args){

        String resultFileName = "user-record.txt";
        String resultFileLocation = System.getProperty("user.dir");
        String resultFilePath = resultFileLocation + File.separator + resultFileName;

        List<User> newUser = new ArrayList<>();

        String firstName,lastName,userName,password;

        try {

            PrintWriter myConsole = new PrintWriter(resultFilePath);
            Scanner input = new Scanner(System.in);

            System.out.println("Enter first name: ");
            firstName = input.next();
            myConsole.print(firstName + ":");

            System.out.println("Enter last name: ");
            lastName = input.next();
            myConsole.print(lastName + ":");

            System.out.println("Enter username: ");
            userName = input.next();
            myConsole.print(userName + ":");

            System.out.println("Enter password");
            password = input.next();
            myConsole.println(password);

            User user = new User(firstName,lastName,userName,password);
            newUser.add(user);



            myConsole.close();
        } catch (FileNotFoundException ex) {


        }



    }
}
