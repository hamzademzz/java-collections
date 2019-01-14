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

}
