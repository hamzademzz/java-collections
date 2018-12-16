package org.interviewquestion;

//There is an array with every element repeated twice except one. Find that element?

public class Question10 {

    public static void main(String[] args){

        int[] numbers={1,1,1,1,1,2,2,2,2,2,2,43423,3,3,3342324,3,3,3,3,3,3,3,5,5,5,5,5};
        int nonDuplicatedNumber=0;
        int count=0;


        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers.length;j++){
                if (i!=j) {
                    if (numbers[i] != numbers[j]) {
                        nonDuplicatedNumber = 1;
                    } else {
                        nonDuplicatedNumber = 0;
                        break;
                    }
                }
            }
            if (nonDuplicatedNumber==1){
                count++;
                System.out.println("Non Duplicated Number is : " + numbers[i]);
            }

        }


    }
}
