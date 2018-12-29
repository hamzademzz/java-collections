package List.Questions;

//8. Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collections;


public class Question8 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors .add("Red");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println(colors);
        Collections.sort(colors);
        System.out.println(colors);

    }
}
