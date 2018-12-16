package org.interviewquestion;

// How to find the first repeating element in an array of integers?

public class Question14 {

    public static void main(String[] args){

        int[]numbers={1,2,2,3,4,4,5,6,7,7,8,8};

        int duplicateCount=0;

        for (int i=0;i<numbers.length;i++){
            boolean duplicateFound=false;
            for (int j=0;j<numbers.length;j++){
                if (i!=j && numbers[i]==numbers[j]) {
                    duplicateFound = true;
                    duplicateCount++;
                    break;


                }
            }

            if (duplicateFound==true){
                System.out.println("First repeating element in the array is : " +numbers[i]);
                break;
            }
        }



    }
}
