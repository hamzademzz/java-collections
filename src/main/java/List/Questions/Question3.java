package List.Questions;

//3. Write a Java program to insert an element into the array list at the first position

import java.util.ArrayList;

public class Question3 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        colors.add(0 ,"Blue");

        System.out.println(colors);

    }

}
