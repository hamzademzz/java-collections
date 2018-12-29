package List.Questions;

//12.Write a Java program to extract a portion of a array list.

import java.util.ArrayList;
import java.util.List;

public class Question12 {

    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");

        //LEARN HOW TO WRITE A SUBLIST
        List<String> colorsSubList = colors.subList(2 , 4);

        System.out.println(colorsSubList);
    }
}
