package List;

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;

public class Question4 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors .add("Red");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println(colors.get(1));
    }
}
