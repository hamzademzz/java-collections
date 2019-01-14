package Set;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;




import java.util.*;

public class HamzaSet<T> implements Set<T> {
    int count = 0;
    int capacity = 1;
    Object[] items = new Object[capacity];


    /**
     * size
     */

    public int size() {
        return count;
    }

    /**
     * isEmpty
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * contains
     */
    public boolean contains(Object o) {
        for(int i=0; i<size(); i++){
            if(items[i] == o){
                return true;
            }
        }
        return false;
    }









    public Iterator<T> iterator() { throw new NotImplementedException();}







    /**
     * toArray
     */

    public Object[] toArray() {
        Object[] arr = new Object[count];
        for (int i = 0; i < count; i++) {
            arr[i] = items[i];
        }
        return arr;
    }


    public <T> T[] toArray(T[] a) {
        T[] arr = (T[]) new Object[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (T) items[i];
        }
        return arr;
    }

    /**
     * add
     */

    public boolean add(T e) {

        for(int i=0; i<size(); i++){
            if(items[i] == e){
                return false;
            }
        }
        if (capacity < count + 1) {
            increaseCapacity();
        }
        items[count] = e;
        count++;

        return true;
    }



    /**
     * remove
     */

    public boolean remove(Object o) {
        int index =0;

        for(int i=0; i<size(); i++){
            if(items[i] == o){
                index = i;
            }
        }

        if (index < 0) return false;
        shiftLeft(items, index, count);
        count--;
        return true;
    }








    public boolean containsAll(Collection<?> c) {
        throw new NotImplementedException();
    }

    public boolean addAll(Collection<? extends T> c) {
        throw new NotImplementedException();
    }

    public boolean retainAll(Collection<?> c) {
        throw new NotImplementedException();
    }

    public boolean removeAll(Collection<?> c) {
        throw new NotImplementedException();
    }









    /**
     * add
     */

    public void clear() {
        count = 0;
        capacity = 1;
        items = new Object[capacity];
    }

    private void increaseCapacity() {
        capacity = capacity * 2;
        Object[] tmp = new Object[capacity];
        for (int i = 0; i < count; i++) {
            tmp[i] = items[i];
        }
        items = tmp;
    }


    private void shiftLeft(Object[] items, int index, int count) {
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
    }
}

