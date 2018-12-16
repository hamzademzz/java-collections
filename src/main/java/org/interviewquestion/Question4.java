package org.interviewquestion;

public class Question4 {

    public static void main(String[] args){

        int[] numbers={1,2,3,4,5,6};
        int largest=numbers[0];
        int smallest=numbers[0];

        for (int i=0;i<numbers.length;i++){
            if (numbers[i]<smallest){
                smallest=numbers[i];


            }
            else{largest=numbers[i];}
        }

        System.out.println("Smallest Number is : "+smallest);
        System.out.println("Largest Number is : "+largest);

    }
}
