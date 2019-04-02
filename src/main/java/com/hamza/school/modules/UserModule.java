package com.hamza.school.modules;

import com.hamza.school.domain.User;
import com.hamza.school.repositories.users.UserFileRepository;
import com.hamza.school.repositories.users.UserRepository;
import com.hamza.school.utils.MyFileUtils;
import com.hamza.school.utils.PrintUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserModule implements Module {
    private final UserRepository userService;
    UserFileRepository userFileRepository;
    public UserModule(UserRepository userService){
        this.userService=userService;
    }

    public void showMenu() throws IOException{
        PrintUtils.clearScreen();
        Scanner scanner = new Scanner(System.in);
        Integer selectedOption;
        boolean continueToProcess=true;

        do {
            System.out.println("1-) Add");
            System.out.println("2-) List");
            System.out.println("3-) Find");
            System.out.println("4-) Update");
            System.out.println("5-) Delete");
            System.out.println("6-) Main Menu");
            System.out.println("7-) Exit");
            selectedOption = scanner.nextInt();
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
                    continueToProcess=false;
                    break;
                case 7:
                    System.exit(0);
                    break;
            }

        } while (continueToProcess);
    }

     public void add() throws IOException {
         MyFileUtils myFile = new MyFileUtils();
         String filePath = myFile.getUserFilePath("user-record.txt");
         UserFileRepository userFileRepository = new UserFileRepository(filePath);
         User user = userFileRepository.inputUser();
         FileWriter fileWriter = new FileWriter(filePath, true);
         userFileRepository.addUser(fileWriter, user);
     }


     public void list(){
         MyFileUtils myFile = new MyFileUtils();
         String filePath = myFile.getUserFilePath("user-record.txt");
         UserFileRepository userFileRepository = new UserFileRepository(filePath);
         userFileRepository.getAll();
     }

     public void find(){
         System.out.println("Enter the username of the user you want to find : ");
         MyFileUtils myFile = new MyFileUtils();
         String filePath = myFile.getUserFilePath("user-record.txt");
         UserFileRepository userFileRepository = new UserFileRepository(filePath);
         Scanner input = new Scanner(System.in);
         String id = input.next();
         System.out.println("User Search : " + userFileRepository.get(id));

     }

     public void update(){
         System.out.println("Enter the username of the user you want to update : ");
         MyFileUtils myFile = new MyFileUtils();
         String filePath = myFile.getUserFilePath("user-record.txt");
         UserFileRepository userFileRepository = new UserFileRepository(filePath);
         Scanner input = new Scanner(System.in);
         User user = userFileRepository.get(input.next());
         userFileRepository.update(user);
     }

     public void delete(){
         System.out.println("Enter the username of want to delete : ");
         MyFileUtils myFile = new MyFileUtils();
         String filePath = myFile.getUserFilePath("user-record.txt");
         UserFileRepository userFileRepository = new UserFileRepository(filePath);
         Scanner input = new Scanner(System.in);
         userFileRepository.delete(input.next());

     }
}
