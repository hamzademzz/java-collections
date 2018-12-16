package org.interviewquestion;

//How to merge sorted array?

public class Question22 {

    public static void main(String[] args){

        int[] numbers1={1,2,3,4,5,6,7};
        int[] numbers2={8,9,10,11,12,13,14};
        int count=0;

            int[] mergedArray=new int[numbers1.length+numbers2.length];

            for (int i=0;i<numbers1.length;i++){
                mergedArray[i]=numbers1[i];
                count++;

            }
            for (int j=0;j<numbers2.length;j++){
                mergedArray[count++]=numbers2[j];

            }

            for (int p=0;p<count;p++){
                System.out.println(mergedArray[p]);
            }


        }
    }










//    int maxCount=numbers1.length;
//        if (numbers2.length>maxCount){
//                maxCount=numbers2.length;