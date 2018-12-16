package org.interviewquestion;

//1. How to find the missing number in integer array of 1 to 100?


public class Question1 {

    public static void main(String[] args) {

        int numberNotToAdd = 7;
        int count = 100;
        int[] numbers = new int[count];
        int numberIndex = 0;
        for (int i = 0; i < count; i++) {
            int number = i + 1;
            if (number != numberNotToAdd) {
                numbers[numberIndex] = number;
                numberIndex++;
            }
        }

        int expectedSum = count * (count + 1) / 2;
        int sum = 0;

        for (int i = 0; i < numberIndex; i++) {
            sum += numbers[i];
        }

        int missingNumber = expectedSum-sum;


        System.out.println("Sum = " + sum);
        System.out.println("Expected Sum = " + expectedSum);
        System.out.println("Missing number = " + missingNumber);

    }
}
