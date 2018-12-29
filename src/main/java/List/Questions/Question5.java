package List.Questions;

//5. Write a Java program to update specific array element by given element.

import java.util.ArrayList;

public class Question5 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();



        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println(colors);
        colors.set(1, "Updated Color");
        System.out.println(colors);


    }
}
