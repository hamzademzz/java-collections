package org.interviewquestion;

//        9.   Write a program to find intersection of two sorted arrays in Java?

public class Question9 {

    public static void main(String[] args){

        int[] firstArray={21, 34, 41, 22, 35};
        int[] secondArray={61, 34, 45, 21, 11};
        int maxCount=firstArray.length;
        if(secondArray.length>maxCount)
            maxCount=secondArray.length;

        int[] intersections=new int [maxCount];
        int intersectionCount=0;

        for (int i=0;i<firstArray.length;i++){
           for (int j=0;j<secondArray.length;j++){
               if (firstArray[i]==secondArray[j]){
                   intersections[intersectionCount]=firstArray[i];
                   intersectionCount++;
               }

           }
       }


       for(int i=0;i<intersectionCount;i++){
           System.out.println(intersections[i]);
       }





    }
}
