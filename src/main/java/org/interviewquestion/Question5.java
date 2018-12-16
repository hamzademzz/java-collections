package org.interviewquestion;

//        5. How to find all pairs on integer array whose sum is equal to given number?


import java.util.Scanner;

public class Question5 {

    public static void main(String[] args){

        int[] number={1,2,3,4,5,6,7,8,9};
        Scanner scanner=new Scanner(System.in);


        System.out.println("Numbers whose sum is :" );
        int givennumber=scanner.nextInt();

        for (int i=0;i<number.length;i++){
            for (int j=i+1;j<number.length;j++){
                if (number[i]+number[j]==givennumber){
                    System.out.println(number[i] + " + " + number[j]+ " = " +givennumber);

                }
            }



        }

    }
}
