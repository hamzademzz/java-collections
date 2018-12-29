package org.interviewquestion;

import List.Question1;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ArrayListTest {
    // ??????
    @Test
    public void addShouldAddToArrayList() {
        Question1 question1 = new Question1();

        String expected = "Red";
        question1.add(expected);
        String actual = question1.getLast();

        assertEquals(expected, actual);


    }


}
