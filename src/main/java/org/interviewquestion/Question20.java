package org.interviewquestion;

import java.util.Arrays;

//How to remove duplicates from array in place?

public class Question20 {

    public static void main(String[] args){

        int[] numbers={1,2,3,1,2,3};
        int[] nonDuplicates=new int[numbers.length];
        int nonDuplicateCount=0;


        for (int i=0;i<numbers.length;i++) {
            boolean foundDuplicate=false;
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    foundDuplicate = true;
                    break;
                }
            }

            if (foundDuplicate == false) {
                nonDuplicateCount++;
                nonDuplicates[nonDuplicateCount - 1] = numbers[i];

            }
        }

        for (int i=0;i<nonDuplicateCount;i++) {
            System.out.println(nonDuplicates[i]);
        }
    }






}
