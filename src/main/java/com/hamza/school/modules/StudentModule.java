package com.hamza.school.modules;

import com.hamza.school.utils.PrintUtils;

import java.io.IOException;
import java.util.Scanner;

public class StudentModule implements Module {

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
//                case 1: addStudent(filePath, user);
//                case 2: listStudent();
//                case 3: findStudent();
//                case 4: updateStudent();
//                case 5: deleteStudent();
                case 6:
                    continueToProcess=false;
                    break;
                case 7:
                    System.exit(0);
            }

        } while (continueToProcess);
    }
}
