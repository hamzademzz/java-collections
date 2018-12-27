package List;

//9. Write a Java program to copy one array list into another.

import java.util.ArrayList;
import java.util.Collections;

public class Question9 {

    public static void main(String[] args){

        ArrayList<Integer> numbers1 = new ArrayList<Integer>();

        numbers1.add(1);
        numbers1.add(2);


        ArrayList<Integer> numbers2 = new ArrayList<Integer>();

        numbers2.add(4);
        numbers2.add(5);



        System.out.println(numbers1);
        System.out.println(numbers2);

        Collections.copy(numbers1, numbers2);

        System.out.println("After Copying");

        System.out.println(numbers1);
        System.out.println(numbers2);


    }
}
