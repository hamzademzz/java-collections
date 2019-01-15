package Set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class HamzaSetTest {

    @Test
    public void addShouldAdd(){
        Set<Integer> items = new HamzaSet<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(1);
        items.add(2);
        Integer expected = 3;
        Integer actual = items.size();
        assertEquals(expected,actual);

    }

    @Test
    public void sizeShouldReturnSize(){
        Set<Integer> items = new HamzaSet<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(1);
        Integer expected = 3;
        Integer actual = items.size();
        assertEquals(expected,actual);
    }

    @Test
    public void isEmptyShouldReturnTrueOrFalse(){
        Set<Integer> items = new HamzaSet<Integer>();
        items.add(1);
        Boolean expected = false;
        Boolean actual = items.isEmpty();
        assertEquals(expected,actual);
    }

    @Test
    public void containsSpecificItem(){
        Set<Integer> items = new HamzaSet<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        Boolean expected = true;
        Boolean actual = items.contains(1);
        assertEquals(expected,actual);
    }

    @Test
    public void clearShouldClear(){
        Set<Integer> items = new HamzaSet<Integer>();
        items.add(1);
        items.add(2);
        items.clear();
        Integer expected = 0;
        Integer actual = items.size();
        assertEquals(expected,actual);
    }

    @Test
    public void removeShouldRemoveElement(){
        Set<Integer> items = new HamzaSet<Integer>();
        Integer itemToRemove = 2;
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(6);
        items.remove(itemToRemove);
        Integer expected = 5;
        Integer actual = items.size();
        assertEquals(expected,actual);
    }
    /*
    @Test
    public void containsAll(){
        Set<Integer> items = new HamzaSet<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);

        Set<Integer> items2 = new HamzaSet<Integer>();
        items2.add(1);
        items2.add(2);
        items2.add(3);

        Boolean expected = true;
        Boolean actual = items.containsAll(items2);

        assertEquals(expected,actual);

    }
    */

    @Test
    public void addAll(){
        Set<Integer> items = new HamzaSet<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);

        Set<Integer> items2 = new HamzaSet<Integer>();
        items2.add(1);
        items2.add(2);
        items2.add(3);

        items.addAll(items2);

        Integer expected = 6;
        Integer actual = items.size();



        assertEquals(expected,actual);

    }

}
