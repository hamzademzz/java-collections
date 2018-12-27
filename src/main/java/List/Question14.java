package List;

//14. Write a Java program of swap two elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Question14 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        Collections.swap(colors , 0 ,2);

        System.out.println(colors);


    }
}
