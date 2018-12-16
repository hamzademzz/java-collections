package org.interviewquestion;

//Given an array of of size n and a number k, find all elements that appear more than n/k times?

public class Question27 {
    public static void main(String[] args) {

        int[] numbers = {4, 5, 7, 3, 5, 98, 65, 43, 23, 67, 78, 32, 4, 12, 25, 12, 15, 4, 67, 23, 34, 54, 2, 10, 23};
        int n = numbers.length;
        int k = 12;
        int nk = n / k;

        int duplicateIndex = 0;
        int duplicatedCount = 1;
        int[][] duplicated = new int[numbers.length][2];

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicated = false;
            for (int j = i + 1; j < numbers.length; j++) {
                boolean isRepeatedDuplication = false;
                for (int m = 0; m < duplicateIndex; m++) {
                    if (m != duplicateIndex && duplicated[m][0] == numbers[i]) {
                        isRepeatedDuplication = true;
                    }
                }
                if (numbers[i] == numbers[j] && !isRepeatedDuplication) {
                    isDuplicated = true;
                    duplicatedCount++;
                    duplicated[duplicateIndex][0] = numbers[i];
                    duplicated[duplicateIndex][1] = duplicatedCount;
                }
            }
            duplicatedCount = 1;
            if (isDuplicated) {
                duplicateIndex++;
            }
        }

        System.out.println(nk);
        for (int i = 0; i < duplicateIndex; i++) {
            if (duplicated[i][1] > nk) {
                System.out.println(duplicated[i][0] + " -> " + duplicated[i][1]);
            }
        }

    }
}

