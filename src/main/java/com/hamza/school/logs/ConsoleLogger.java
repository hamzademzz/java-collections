package com.hamza.school.logs;

import java.util.Scanner;

public class ConsoleLogger implements Logger {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void printLine(String message) {
        System.out.println(message);
    }

    @Override
    public String scanNext() {
        return scanner.next();
    }

    @Override
    public Integer nextInt() {
        return scanner.nextInt();
    }

    @Override
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    @Override
    public void exit() {
        System.exit(0);
    }
}
