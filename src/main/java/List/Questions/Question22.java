package List.Questions;

//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.

import java.util.ArrayList;

public class Question22 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");


        for(int i=0 ; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }


    }

}
