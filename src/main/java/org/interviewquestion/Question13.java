package org.interviewquestion;

//How to find common elements in three sorted array?

public class Question13 {
    public static void main(String[] args) {

        int[] input1 = {1, 5, 10, 20,7,2 ,40,90};
        int[] input2 = {6,  20, 80,7,2, 100,90};
        int[] input3 = {3, 4, 15, 30,7,2, 70, 80, 120};
        int maxcount=input1.length;
        if (input2.length>maxcount){
            maxcount=input2.length;
        }

        int[] temporraryArray=new int[maxcount];
        int temporaryArrayCount=0;


        for (int i=0;i<input1.length;i++){
            for (int j=0;j<input2.length;j++){
                if (input1[i] == input2[j]) {
                    temporraryArray[temporaryArrayCount] = input1[i];
                    temporaryArrayCount++;


                }  }
        }

        int length=temporraryArray.length;
        if (input3.length>length){
           length=input3.length;
        }

        int[] intersection=new int[length];
        int intersectionCount=0;

        for (int i=0;i<temporraryArray.length;i++){
            for (int j=0;j<input3.length;j++){
                if (temporraryArray[i]==input3[j]){
                    intersection[intersectionCount]=temporraryArray[i];
                    intersectionCount++;

                }

            }
        }

        for (int i=0;i<intersectionCount;i++){
            System.out.println(intersection[i]);
        }

    }
}
