package org.interviewquestion;

//How to reverse array in place in Java?

public class Question28 {

    public static void main(String[] args){

        int[] numbers={1,2,3,4,6,7,8,9,10};
        int[] reversedArray=new int[numbers.length];



        for (int i=0;i<numbers.length;i++){
            reversedArray[i]=numbers.length-i;
            System.out.println(reversedArray[i]);

        }

    }
}
