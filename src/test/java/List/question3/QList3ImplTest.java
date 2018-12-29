package List.question3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class QList3ImplTest {

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

}
