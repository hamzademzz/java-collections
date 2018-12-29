package List.Questions;

//13.Write a Java program to compare two array lists

import java.util.ArrayList;
import java.util.Collections;

public class Question13 {

    public static void main(String[] args){
        ArrayList<String> colors1 = new ArrayList<String>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Yellow");


        ArrayList<String> colors2 = new ArrayList<String>();
        colors2.add("Green");
        colors2.add("Yellow");
        colors2.add("Orange");

        ArrayList<String> colors3 = new ArrayList<String>();

        for (String s : colors1){
           if(colors2.contains(s)){
               System.out.println("Yes");
               colors3.add(s);
           }else{
               System.out.println("No");
               colors3.add(s);

           }
        }

        System.out.println(colors3);

    }
}
