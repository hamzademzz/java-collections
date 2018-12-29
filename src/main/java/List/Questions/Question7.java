package List.Questions;

//7. Write a Java program to search an element in a array list

import java.util.ArrayList;

public class Question7 {

    public static void main(String[] args){


        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");


        System.out.println(colors.contains("Red"));

        System.out.println(colors.isEmpty());
    }
}
