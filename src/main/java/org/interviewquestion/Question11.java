package org.interviewquestion;

//How to find kth smallest element in unsorted array?

import java.util.Scanner;

public class Question11 {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        int[] numbers={4,3,6,2,7,5,3,8,19,24,21};
        int smallest=numbers[0];


        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[i]>numbers[j]){
                    int temp=numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=temp;
                }
            }

        }
        System.out.println("Type a number to find kth element :");
        int userInput=scanner.nextInt();


        for (int i=0;i<numbers.length;i++){
            if (numbers[userInput-1]<smallest){
                smallest=numbers[i];


            }
        }

        System.out.println(numbers[userInput-1]);
    }
}
