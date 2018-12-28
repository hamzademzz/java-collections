package List;

//21. Write a Java program to replace the second element of a ArrayList with the specified element.

import java.util.ArrayList;


public class Question21 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");

        colors.set(1,"NEW COLOR");

        System.out.println(colors);

    }
}
