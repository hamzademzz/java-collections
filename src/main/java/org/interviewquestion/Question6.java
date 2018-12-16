package org.interviewquestion;

//How to find repeated numbers in an array if it contains multiple duplicates?

public class Question6 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,1,2,3,4,1};
        int[] uniqueNumbers = new int[numbers.length];
        int uniqueNumberCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean exists = false;
            for (int j = 0; j < uniqueNumberCount; j++) {
                if (numbers[i] == uniqueNumbers[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                uniqueNumbers[uniqueNumberCount] = numbers[i];
                uniqueNumberCount++;
            }
        }


        boolean duplicatefound = false;
        for (int i = 0; i < uniqueNumberCount; i++) {
            int count = 0;
            for (int k = 0; k < numbers.length; k++) {
                int uniqueNumber = uniqueNumbers[i];
                int number = numbers[k];
                if (uniqueNumber == number) {
                    count++;
                }
            }
            if (count > 2) {
                duplicatefound = true;
                break;
            }
        }

        if (duplicatefound) {
            System.out.println("Duplicate Found");
        } else {
            System.out.println("Not Found");
        }

    }
}
