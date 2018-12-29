package List.Questions;

//6. Write a Java program to remove the third element from a array list.

import java.util.ArrayList;

public class Question6 {

    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<String>();

        colors .add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors .add("Blue");//
        colors.add("Purple");
        colors.add("White");

        colors.remove(3);

        System.out.println(colors);


    }
}
