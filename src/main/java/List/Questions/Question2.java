package List.Questions;

//2. Write a Java program to iterate through all elements in a array list.

import List.hamza.HamzaArrayList;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

    public static void main(String[] args){


        List<Integer> items =new HamzaArrayList<Integer>();
        items.add(1);
        items.add(2);



        List<Integer> items2 =new HamzaArrayList<Integer>();
        items2.add(1);
        items2.add(2);




        System.out.println( items.containsAll(items2));





    }
}
