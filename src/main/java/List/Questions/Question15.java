package List.Questions;

//15. Write a Java program to join two array lists.

import java.util.ArrayList;

public class Question15 {

    public static void main(String[] args){

        ArrayList<String> colors1 = new ArrayList<String>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Yellow");
        ArrayList<String> colors2 = new ArrayList<String>();
        colors2.add("Blue");
        colors2.add("White");
        colors2.add("Black");




        ArrayList<String> addTwoArrayList = new ArrayList<String>();

        /*
        System.out.println(addTwoArrayList);

        for(String s : colors1){
            addTwoArrayList.add(s);
        }

        System.out.println(addTwoArrayList);

        for(String s : colors2){
            addTwoArrayList.add(s);
        }

        System.out.println(addTwoArrayList);

        */

        //OR MUCH EASIER THAN THIS USE ADD ALL

        addTwoArrayList.addAll(colors1);
        addTwoArrayList.addAll(colors2);
        System.out.println(addTwoArrayList);








    }
}
