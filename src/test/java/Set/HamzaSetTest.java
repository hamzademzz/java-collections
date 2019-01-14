package Set;

import org.junit.Test;

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
        Integer expected = 3;
        Integer actual = items.size();
        assertEquals(expected,actual);

    }
}
