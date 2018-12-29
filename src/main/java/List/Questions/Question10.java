package List.Questions;

//10. Write a Java program to shuffle elements in a array list.

import java.util.ArrayList;
import java.util.Collections;

public class Question10 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        Collections.shuffle(colors);

        System.out.println(colors);

    }
}
