package List.hamza;

import org.junit.Test;

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
    public void removeShouldRemove(){
        List<Integer> items =new HamzaArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.remove(1);
        Integer actual = items.size();
        Integer expected = 1;

    }


}
