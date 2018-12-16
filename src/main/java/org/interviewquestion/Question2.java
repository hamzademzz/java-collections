package org.interviewquestion;

//How to find duplicate number on Integer array in Java?

public class Question2 {

    public static void main(String[] args){

        int[] numbers={0,3,1,2,3};
        int duplicateNumber=-1;
        boolean duplicateFound=false;
        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[i]==numbers[j]){
                    duplicateFound=true;
                    duplicateNumber=numbers[i];
                    break;


                }

            }


        }

        if (duplicateFound==true) {
            System.out.println("Duplicate Found is "+duplicateNumber);
        }
        else{
            System.out.println("Duplicate Not Found");
        }

    }
}
