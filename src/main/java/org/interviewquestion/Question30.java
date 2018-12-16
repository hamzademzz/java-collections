package org.interviewquestion;

// How to check if array contains a duplicate number

public class Question30 {

    public static void main(String[] args){

        int[]numbers={1,2,3,4,5,5,5,6,6,6,6,7,8,9};

        boolean duplicateFound=false;
        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers.length;j++){
                if (numbers[i]==numbers[j]){
                    duplicateFound=true;
                    break;

                }

            }

        }

        if (duplicateFound==true) {
            System.out.println("DUPLICATE FOUND");
        }
            else
        {
            System.out.println("DUPLICATE NOT FOUND");
        }
    }
}

