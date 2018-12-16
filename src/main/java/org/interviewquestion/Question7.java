package org.interviewquestion;

import java.util.Arrays;
//remove duplicates from array

public class Question7 {

    public static void main(String[] args){

        int[] numbers={1,1,1,2,2,2,3,3,3,4,5,6};
        int[] nonDuplicates=new int[numbers.length];
        int nonDuplicateCount=0;

        for (int i=0;i<numbers.length;i++) {
            boolean isADuplicate = false;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    isADuplicate = true;
                    break;

                }
            }
            if (isADuplicate==false){
                nonDuplicateCount++;
                nonDuplicates[nonDuplicateCount-1]=numbers[i];

            }

        }

        for (int i=0;i<nonDuplicateCount;i++){
            System.out.println(" unique elements " + Arrays.toString(nonDuplicates));
        }




    }
}
