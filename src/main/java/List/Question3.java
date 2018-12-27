package List;

//3. Write a Java program to insert an element into the array list at the first position

import java.util.ArrayList;

public class Question3 {

    public static void main(String[] args){

        ArrayList<String> integers = new ArrayList<String>();

        integers.add("Red");
        integers.add("Green");
        integers.add("Yellow");

        integers.add(0 ,"Blue");

        System.out.println(integers);

    }

}
