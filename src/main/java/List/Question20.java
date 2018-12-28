package List;

//20. Write a Java program to increase the size of an array list.

import java.util.ArrayList;

public class Question20 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>(6);

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");


        colors.ensureCapacity(9);

        colors.add("Blue");
        colors.add("White");
        colors.add("Black");

        System.out.println(colors);






    }
}
