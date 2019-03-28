package com.hamza.school.modules;

import com.hamza.school.utils.PrintUtils;

import java.io.IOException;
import java.util.Scanner;

public class MainModule implements Module {

    private final Module userManager;
    private final Module studentManager;
    public MainModule(Module userManager, Module studentManager){
        this.userManager=userManager;
        this.studentManager=studentManager;
    }

    public  void showMenu() throws IOException {
        PrintUtils.clearScreen();
        Scanner scanner = new Scanner(System.in);
        Integer selectedOption;
        boolean continueToProcess=true;

        do {
            showMenuHeader();
            selectedOption = scanner.nextInt();

            switch (selectedOption) {
                case 1:
                    userManager.showMenu();
                    break;
                case 2:
                    studentManager.showMenu();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (continueToProcess);


    }

    private void showMenuHeader() {
        int lineLength = 80;
        String title = "Menu";
        PrintUtils.printX(lineLength, "-", "+", "+");
        PrintUtils.printInBox(lineLength, title);
        PrintUtils.printX(lineLength, "-", "+", "+");
        PrintUtils.printInBoxLeft(lineLength, "1-) User");
        PrintUtils.printInBoxLeft(lineLength ,"2-) Student");
        PrintUtils.printInBoxLeft(lineLength, "3-) Exit");
        PrintUtils.printX(lineLength, "-", "+", "+");
    }
}
