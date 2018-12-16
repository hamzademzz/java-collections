package org.interviewquestion;

//How to find first non-repeating element in array of integers?

public class Question15 {

    public static void main(String[] args){

        int[] numbers={1,1,312312,2,2,3,3,4,4,5,6,6,7,7,8,8,9};
        int nonDuplicateNumber=0;
        int count=0;

        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers.length;j++) {
                if (i != j) {
                    if (numbers[i] != numbers[j]) {
                        nonDuplicateNumber = 1;


                    } else {
                        nonDuplicateNumber = 0;
                        break;

                    }
                }
            }

            if (nonDuplicateNumber==1){
                count++;
                System.out.println("First Non Repeating element is :" + numbers[i]);
                break;
            }
        }
    }
}
