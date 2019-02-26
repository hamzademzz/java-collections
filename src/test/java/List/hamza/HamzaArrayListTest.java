package List.hamza;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class HamzaArrayListTest {
    private List<Integer> items;

    private List<Integer> initList(){
        return new HamzaArrayListPractise1<>();
    }

    @Before
    public void setBefore(){
        items=initList();
    }

    @Test
    public void addShouldAdd() {
        boolean actual = items.add(1);
        assertTrue(actual);

    }


    @Test
    public void addCanBeUsedMultipleTimes() {
        items.add(1);
        items.add(2);
        Integer expected = 2;
        Integer actual = items.size();
        assertEquals(expected, actual);
    }

    @Test
    public void isEmptyShouldReturnTrueOrFalse() {
        items.add(1);
        boolean actual = items.isEmpty();

        assertFalse(actual);

    }


    @Test
    public void containsCheckIfItContains() {
        items.add(1);
        items.add(2);
        items.add(3);
        boolean actual = items.contains(3);
        assertTrue( actual);

    }

    @Test
    public void getUsingIndex() {
        items.add(1);
        items.add(2);
        items.add(3);
        Integer expected = 3;
        Integer actual = items.get(2);
        assertEquals(expected, actual);
    }

    @Test
    public void setUsingIndex() {
        Integer expected = 999;
        int index = 1;
        items.add(1);
        items.add(2);
        items.add(3);
        items.set(index, expected);
        Integer actual = items.get(index);
        assertEquals(expected, actual);
    }


    @Test
    public void indexOf() {
        Integer expected = 2;
        items.add(1);
        items.add(2);
        items.add(3);
        Integer actual = items.indexOf(3);
        assertEquals(expected, actual);
    }

    @Test
    public void lastIndexOf() {
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(2);
        items.add(1);
        Integer expected = 3;
        Integer actual = items.lastIndexOf(2);
        assertEquals(expected, actual);
    }

    @Test
    public void addAtIndex() {
        Integer addedValue = 100;
        int index = 1;
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(index, addedValue);

        assertEquals(addedValue, items.get(index));
        assertEquals(new Integer(2), items.get(2));
        assertEquals(new Integer(3), items.get(3));
        assertEquals(new Integer(4), items.get(4));
        assertEquals(new Integer(5), items.get(5));
    }

    @Test
    public void containsAll() {
        items.add(1);
        items.add(2);


        List<Integer> items2 = initList();
        items2.add(1);
        items2.add(2);

        boolean actual = items.containsAll(items2);

        assertTrue(actual);
    }


    @Test
    public void removeShouldRemove() {
        Integer itemToRemove = 1;
        items.add(1);
        items.add(2);
        items.add(3);
        items.remove(itemToRemove);
        Integer expected = 2;
        Integer actual = items.size();

        assertEquals(expected, actual);
    }


    @Test
    public void clearShouldClear() {
        items.add(1);
        items.add(2);
        items.add(3);
        items.clear();
        assertEquals(items.size(),0);
    }


}















/*










    HOW CAN I CHECK LISTS

    @Test
    public void subListGivesRangeView(){
        List<Integer> items =new HamzaArrayList<Integer>();
        items.add(0);
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);




        assertEquals(expected,actual);


    }
*/


