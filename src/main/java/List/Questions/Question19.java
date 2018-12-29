package List.Questions;

//19. Write a Java program to trim the capacity of an array list the current list size.

import java.util.ArrayList;

public class Question19 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");

        System.out.println(colors);

        colors.trimToSize();

        System.out.println(colors);

    }

}
