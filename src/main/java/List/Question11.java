package List;

//11. Write a Java program to reverse elements in a array list.

import java.util.ArrayList;
import java.util.Collections;

public class Question11 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        Collections.reverse(colors);

        System.out.println(colors);

    }
}
