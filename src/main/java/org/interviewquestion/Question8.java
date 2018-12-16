package org.interviewquestion;

//Sorting

public class Question8 {

    public static void main(String[] args){

        int[] numbers={5,4,3,2,1};

        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[i]<numbers[j]){
                    int kova=numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=kova;

                }

            }

        }

        for (int i=0;i<numbers.length;i++) {
            System.out.println("Sorting Biggest----->Smallest "+numbers[i]);
        }


        System.out.println("--------------------------------------------------------------");

        for (int i=0;i<numbers.length;i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] >numbers[j]) {
                    int kova = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = kova;

                }
            }

        }

        for (int j=0;j<numbers.length;j++){
            System.out.println("Sorting Smallest----->Biggest " +numbers[j]);
        }

    }


}
