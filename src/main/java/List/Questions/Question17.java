package List.Questions;

//17. Write a Java program to empty an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Question17 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");

        System.out.println("Before removal" + colors);

        colors.removeAll(colors);

        System.out.println("After removal " + colors);



    }
}
