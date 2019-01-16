package Map;


import org.junit.Test;



import java.util.Map;

import static org.junit.Assert.assertEquals;


public class HamzaMapTest {

    public static void main(String[] args){

        Map<Integer,String> items = new HamzaMap<Integer, String>();
        items.put(1,"One");
        items.put(2,"Two");
        items.put(3,"Three");

        items.putIfAbsent(2,"123");


        System.out.println(items.keySet());
        System.out.println(items.values());


    }

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

    @Test
    public void checksIfContainsValue(){
        Map<Integer,String> items = new HamzaMap<Integer, String>();
        items.put(1,"One");
        items.put(2,"Two");
        items.put(3,"Three");
        items.put(4,"Four");
        items.put(5,"Five");
        items.put(6,"Six");

        Boolean expected = true;
        Boolean actual = items.containsValue("Five");

        assertEquals(expected,actual);
    }

    @Test
    public void getsValueAtSpecificKey(){
        Map<Integer,String> items = new HamzaMap<Integer, String>();
        items.put(1,"One");
        items.put(2,"Two");
        items.put(3,"Three");
        items.put(4,"Four");
        items.put(5,"Five");
        items.put(6,"Six");

        String expected = "Six";
        String actual = items.get(6);

        assertEquals(expected,actual);
    }


    @Test
    public void removesValueByKey(){
        Map<Integer,String> items = new HamzaMap<Integer, String>();
        Integer keyToRemove = 2;
        items.put(1,"One");
        items.put(2,"Two");
        items.put(3,"Three");
        items.put(4,"Four");
        items.put(5,"Five");
        items.put(6,"Six");
        items.put(7,"Seven");

        items.remove(keyToRemove);

        Integer expected = 6;
        Integer actual = items.size();

        assertEquals(expected,actual);
    }

    @Test
    public void clearShouldClear(){
        Map<Integer,String> items = new HamzaMap<Integer, String>();
        items.put(1,"One");
        items.put(2,"Two");
        items.put(3,"Three");

        items.clear();

        Integer expected = 0;
        Integer actual =items.size();

        assertEquals(expected,actual);

    }

    @Test
    public void removesValueByKeyAndValue(){
        Map<Integer,String> items = new HamzaMap<Integer, String>();
        Integer keyToRemove = 2;
        String valueToRemove="Two";
        items.put(1,"One");
        items.put(2,"Two");
        items.put(3,"Three");
        items.put(4,"Four");
        items.put(5,"Five");
        items.put(6,"Six");
        items.put(7,"Seven");

        items.remove(keyToRemove,valueToRemove);

        Integer expected = 6;
        Integer actual = items.size();

        assertEquals(expected,actual);
    }

//    @Test
//    public void putIfAbsent(){
//        Map<Integer, String> items = new HamzaMap<Integer,String>();
//        items.put(1,"One");
//        items.put(2,"Two");
//        items.put(3,"Three");
//        items.putIfAbsent(1, "TEST");
//        items.putIfAbsent(5,"TEST2");
//
//        Integer expected = 3;
//        Integer actual = items.size();
//
//        assertEquals(expected,actual);
//    }

    @Test
    public void replacesValue(){
        Map<Integer,String> items = new HamzaMap<Integer, String>();

        items.put(1,"One");
        items.put(2,"Two");
        items.put(3,"Three");
        items.put(4,"Four");
        items.put(5,"Five");
        items.put(6,"Six");
        items.put(7,"Seven");
        items.replace(1,"TEST");


        String expected = "TEST";
        String actual = items.get(1);

        assertEquals(expected,actual);
    }











}
