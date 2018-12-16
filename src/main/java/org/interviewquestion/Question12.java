package org.interviewquestion;

import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {41, 5, 3, 6, 1, 2,67,98,11,25};
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }

        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < largest) {
                largest = numbers[i];


            }
        }


        System.out.println("Type a number to find kth largest element :");
        int userInput = scanner.nextInt();

        System.out.println(numbers[userInput-1]);
    }

}
