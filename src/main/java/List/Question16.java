package List;

//16. Write a Java program to clone an array list to another array list.

import java.util.ArrayList;
import java.util.Collections;

public class Question16 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");

        ArrayList<String> clone = (ArrayList<String>)colors.clone();



        System.out.println(clone);
        System.out.println(colors);
    }
}
