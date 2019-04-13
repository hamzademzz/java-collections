package com.hamza.school.logs;

public interface Logger {
    void printLine(String message);
    String scanNext();
    Integer nextInt();
    void clearScreen();
    void exit();
}
