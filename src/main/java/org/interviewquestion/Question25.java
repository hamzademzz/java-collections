package org.interviewquestion;

//Write a program to find length of longest consecutive sequence in array of integers?

public class Question25 {


    public static void main(String[] args){

        int[] numbers={1,2,3,4,3343,342342,32423,6543,54323,234,5432,5,6,7,8,9,10,11};
        int[][] consecutive=new int[numbers.length][numbers.length];

        int dim1Index=0;
        int dim2Index=0;
        int maxLength=0;
        int maxlengthIndex=0;
        for (int i=0;i<numbers.length;i++){
            if(i==numbers.length-1){
                if(numbers[i-1]+1==numbers[i]){
                    consecutive[dim1Index][dim2Index]=numbers[i];
                }else{
                    dim1Index++;
                    dim2Index=0;
                    consecutive[dim1Index][dim2Index]=numbers[i];
                }
                if(maxLength<dim2Index+1){
                    maxLength=dim2Index+1;
                    maxlengthIndex=dim1Index;
                }
            }
            else if(numbers[i]+1==numbers[i+1] || numbers[i-1]+1==numbers[i]){
                consecutive[dim1Index][dim2Index]=numbers[i];
                dim2Index++;
            }else{
                if(maxLength<dim2Index+1){
                    maxLength=dim2Index+1;
                    maxlengthIndex=dim1Index;
                }
                dim1Index++;
                dim2Index=0;
            }
        }

        for(int i=0;i<maxLength;i++){
            System.out.print(consecutive[maxlengthIndex][i]+",");
        }

    }

}
