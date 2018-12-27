package List;

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

import java.util.ArrayList;

public class Question1 {

    private static ArrayList<String> colors = new ArrayList<String>();

    public static void main(String[] args){

        colors.add("Red");
        System.out.println(colors);



    }

    public static ArrayList<String> getString(){
        return colors;
    }





}
