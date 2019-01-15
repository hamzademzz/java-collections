
package org.interviewquestion;

import java.util.*;

//check if array contains a number



public class Question3 {

    public static void main(String[] args){


        Map<Integer, String> items = new HashMap<Integer, String>();
        items.put(1,"One");
        items.put(2,"Two");
        items.put(3,"Three");
        items.put(4,"Four");

        System.out.println(items);
        System.out.println(items.remove(1));
        System.out.println(items);


    }
}
