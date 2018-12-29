package List.question1;

import List.question1.QList1;
import List.question1.QList1Impl;
import org.junit.Test;

import static org.junit.Assert.*;

public class QList1ImplTest {

    @Test
    public void addShouldSucceed(){
        QList1 q=new QList1Impl();
        String expected="Red";
        q.add(expected);
        String actual=q.getLast();
        assertEquals(expected,actual);
    }


}