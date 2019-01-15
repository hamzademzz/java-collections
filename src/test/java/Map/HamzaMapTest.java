package Map;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;


import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HamzaMapTest {

    @Test
    public void putShouldAddKeyAndValue(){
        Map<Integer, String> items = new HamzaMap<Integer,String>();
        items.put(1,"One");
        items.put(2,"Two");
        items.put(3,"Three");

        Integer expected = 3;
        Integer actual = items.size();

        assertEquals(expected,actual);
    }

    @Test
    public void sizeShouldReturnSize(){
        Map<Integer, String> items = new HamzaMap<Integer,String>();
        items.put(1,"One");
        items.put(2,"Two");


        Integer expected = 2;
        Integer actual = items.size();

        assertEquals(expected,actual);
    }

    @Test
    public void isEmptyShouldReturnTrueOrFalse(){
        Map<Integer, String> items = new HamzaMap<Integer,String>();
        items.put(1,"One");
        items.put(2,"Two");

        Boolean expected =false;
        Boolean actual = items.isEmpty();

        assertEquals(expected,actual);
    }

    @Test
    public void checksIfContainsKey(){
        Map<Integer,String> items = new HamzaMap<Integer, String>();
        items.put(1,"One");
        items.put(2,"Two");
        items.put(3,"Three");
        items.put(4,"Four");
        items.put(5,"Five");
        items.put(6,"Six");

        Boolean expected = true;
        Boolean actual = items.containsKey(1);

        assertEquals(expected,actual);

    }
}
