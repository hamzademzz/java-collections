package org.interviewquestion;

//How to find minimum value in a rotated sorted array?

public class Question26 {

    public static void main(String[] args){

        int[] numbers={1,2,3,4,6,7,8,9,10};
        int[] reversedArray=new int[numbers.length];
        int smallest=numbers[0];



        for (int i=0;i<numbers.length;i++){
            reversedArray[i]=numbers.length-i;

            if (reversedArray[i]<smallest){
                smallest=reversedArray[i];


            }



        }

        System.out.println("Smallest :" +smallest);










    }
}
