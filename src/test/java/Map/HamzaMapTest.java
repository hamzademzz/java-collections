package Map;

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
}
