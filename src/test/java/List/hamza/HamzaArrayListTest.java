package List.hamza;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class HamzaArrayListTest {

    @Test
    public void addShouldAdd(){
        List<Integer> items = new HamzaArrayList<Integer>();
        boolean actual =items.add(1);
        assertTrue(actual);

    }


    @Test
    public void addCanBeUsedMultipleTimes(){
        List<Integer> items = new HamzaArrayList<Integer>();
        items.add(1);
        items.add(2);
        Integer actual = items.size();
        Integer expected=2;
        assertEquals(expected, actual);
    }

    @Test
    public void isEmptyShouldReturnTrueOrFalse(){
        List<Integer> items =new HamzaArrayList<Integer>();
        items.add(1);
        boolean expected = items.isEmpty();
        boolean actual = false;

        assertEquals(expected, actual);

    }


    @Test
    public void containsCheckIfItContains(){
        List<Integer> items =new HamzaArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        boolean expected = items.contains(3);
        boolean actual = true;
        assertEquals(expected,actual);

    }

    @Test
    public void getUsingIndex(){
        List<Integer> items =new HamzaArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        Integer expected = items.get(2);
        Integer actual = 3;
        assertEquals(expected,actual);

    }






}










 /*
    @Test
    public void removeShouldRemove(){
        List<Integer> items =new HamzaArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.remove(1);
        Integer actual = items.size();
        Integer expected = 1;

    }
     */