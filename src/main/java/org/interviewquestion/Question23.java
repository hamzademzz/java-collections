package org.interviewquestion;

//How to find sub array with maximum sum in an array of positive and negative number?

public class Question23 {

    public static void main(String[] args){

        int[] numbers={-56, 44,-34, 44, 31, -41234, -11, 5, -3,6};

        int maxSoFar= 0;
        int maxEndingHere = 0;


        for (int i=0;i<numbers.length;i++){
            maxEndingHere=maxEndingHere+numbers[i];


            if (maxSoFar<maxEndingHere){
                maxSoFar=maxEndingHere;

            }

            if (maxEndingHere<0) {
                maxEndingHere = 0;

            }




        }

        System.out.println("Sub Array with largest contagious sum : "+ maxSoFar);


    }


}
