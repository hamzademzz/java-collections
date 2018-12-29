package List.Questions;

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

import java.util.ArrayList;

public class Question1 {

    private  ArrayList<String> colors = new ArrayList<String>();

    public void add(String s){
        colors.add(s);
    }

    public String getLast(){
        return colors.get(colors.size()-1);
    }


}
