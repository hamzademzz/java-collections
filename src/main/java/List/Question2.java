package List;

//2. Write a Java program to iterate through all elements in a array list.

import java.util.ArrayList;

public class Question2 {

    public static void main(String[] args){

        ArrayList<String> integers = new ArrayList<String>();

        integers.add("Red");
        integers.add("Green");
        integers.add("Yellow");

        for(String stringElements : integers){
            System.out.println(stringElements);
        }




    }
}
