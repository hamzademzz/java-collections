package org.interviewquestion;

//How to find top two numbers from an integer array?

public class Question16 {

    public static void main(String[] args){

        int[] numbers={3,4,12,12,3,2,3,142,1,1};
        int largest=numbers[0];
        int secondLargest=numbers[1];


        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>largest){
                secondLargest=largest;
                largest=numbers[i];

            }
            else{
                if (numbers[i]>secondLargest){
                    secondLargest=numbers[i];

                }
            }



        }

        System.out.println(largest);
        System.out.println(secondLargest);


    }
}
