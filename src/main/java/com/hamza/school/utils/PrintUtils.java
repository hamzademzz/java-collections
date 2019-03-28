package com.hamza.school.utils;

public class PrintUtils {
    public static void printInBox(int lineLength, String title) {
        int startLength = (lineLength - title.length()) / 2;
        printX(startLength, " ", "|", "");
        System.out.print(title);
        printX(startLength, " ", "", "|");
    }

    public static void printInBoxLeft(int lineLength, String title) {
        int startLength = (lineLength - title.length()) / 2;
        System.out.print("|");
        System.out.print(title);
        printX(startLength - 1, " ", "", "");
        printX(startLength, " ", "", "|");
    }

    public static void printX(int count, String ch, String startChar, String endChar) {
        if (startChar.length() > 0 && !ch.equals(startChar)) {
            count = count - 1;
        }
        if (endChar.length() > 0 && !ch.equals(endChar)) {
            count = count - 1;
        }

        if (startChar.length() > 0 && !ch.equals(startChar)) {
            System.out.print(startChar);
        }
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
        if (endChar.length() > 0 && !ch.equals(endChar)) {
            System.out.println(endChar);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
