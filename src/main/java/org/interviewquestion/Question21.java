package org.interviewquestion;

//21. How to remove a given element from array in Java?

import java.util.Scanner;

public class Question21 {

    public static void main(String[] args){

        int[] numbers={1,2,3,4,5,6,7,8,9};
        int[] newarray=new int[numbers.length];
        int newarraycount=0;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Type the number you want to remove : ");
        int userInput=scanner.nextInt();


        for (int i=0;i<numbers.length;i++){
            if (numbers[i]==userInput){
                newarraycount++;
                newarray[newarraycount-1]=numbers[i];
            }
        }

        for (int i=0;i<newarraycount;i++){
            System.out.println(newarray[i]);
        }







    }
}
