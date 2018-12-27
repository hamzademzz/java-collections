package List;

//18. Write a Java program to test an array list is empty or not.

import java.util.ArrayList;

public class Question18 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");

        System.out.println(colors.isEmpty());

        colors.removeAll(colors);

        System.out.println(colors.isEmpty());

    }
}
