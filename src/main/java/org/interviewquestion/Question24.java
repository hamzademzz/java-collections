package org.interviewquestion;

//How to find sub array with largest product in array of both positive and negative number?

public class Question24 {

    public static void main(String[] args){

        int[] numbers={-66,-50,-2,-1,1,2,333333,44444444};

        int smallest=numbers[0];
        int secondSmallest=numbers[1];
        int largest=numbers[0];
        int secondLargest=numbers[1];

        for (int i=0;i<numbers.length;i++){
            for (int p=i+1;p<numbers.length;p++){
                if (numbers[i]>numbers[p]){
                    int kova=numbers[p];
                    numbers[i]=numbers[p];
                    numbers[i]=kova;

                }

            }

        }



        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>largest){
                largest=numbers[i];

            }
            else{
                if (numbers[i]>secondLargest){
                    secondLargest=numbers[i];
                }

            }


        }

        for (int i=0;i<numbers.length;i++){



        }

        for (int j=0;j<numbers.length;j++){
            if (numbers[j]<smallest){
                smallest=numbers[j];

            }

            else{
                if (numbers[j]<secondSmallest){
                    secondSmallest=numbers[j];
                }
            }
        }

        System.out.println("Largest :"+ largest);
        System.out.println("Second Largest " + secondLargest);
        System.out.println("Smallest :"+ smallest);
        System.out.println("Second Smallest " + secondSmallest);

        if (largest*secondLargest> smallest*secondSmallest){
            System.out.println(largest*secondLargest);
        }
        else{
            System.out.println(smallest*secondSmallest);
        }






    }

}
