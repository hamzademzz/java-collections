package List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class QuestionsTest {

    @Test
    public void shouldAddAtIndex0(){
        List<Integer> items=new ArrayList<Integer>();
        items.add(2);
        items.add(3);
        items.add(0,1);
        Integer actual=items.get(0);
        Integer expected=1;
        assertEquals(expected,actual);

    }

    @Test
    public void RetrieveElementAtSpecificIndex(){
        Integer expected=2;
        List<Integer> items=new ArrayList<Integer>();
        items.add(1);
        items.add(expected);
        items.add(3);

        Integer actual=items.get(1);
        assertEquals(expected,actual);
    }
}
