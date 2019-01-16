
package org.interviewquestion;

import java.util.*;

//check if array contains a number



public class Question3 {

    public static void main(String[] args){


        Map<Integer, String> items = new HashMap<>();
        items.put(1,"One");
        items.put(2,"Two");
        items.put(3,"Three");
        items.put(4,"Four");

        items.replace(1,"TEST",  "NewTest");


//
//        System.out.println("Normal        - > "+items);
//        System.out.println("keySet        - > "+items.keySet());
//        System.out.println("entrySet      - > "+items.entrySet());
//        System.out.println("values        - > "+items.values());
//        System.out.println("getOrDefault  - > "+items.getOrDefault(5,"two"));
//



        System.out.println(items);



    }
}
