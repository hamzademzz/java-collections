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

    public Iterator<T> iterator() {
        throw new NotImplementedException();
    }

    public Object[] toArray() {
        throw new NotImplementedException();
    }

    public <T> T[] toArray(T[] a) {
        throw new NotImplementedException();
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

    public boolean remove(Object o) {
        throw new NotImplementedException();
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

    public void clear() {
        throw new NotImplementedException();
    }


    private void increaseCapacity() {
        capacity = capacity * 2;
        Object[] tmp = new Object[capacity];
        for (int i = 0; i < count; i++) {
            tmp[i] = items[i];
        }
        items = tmp;
    }
}

