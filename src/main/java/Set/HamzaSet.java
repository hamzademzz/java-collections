package Set;


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
        Iterator<T> iterator=new Iterator<T>() {
            int _index=-1;
            @Override
            public boolean hasNext() {
                return size()>0 && _index<size();
            }

            @Override
            public T next() {
                _index++;
                return (T)items[_index];
            }
        };
        return iterator;
    }







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
        for(Object o:c){
            if(!contains(o)){
                return false;
            }
        }
        return true;
    }


    public boolean addAll(Collection<? extends T> c) {
        boolean succeed=true;
        for(T e:c){
            if(!add(e)){
                succeed=false;
            }
        }
        return succeed;

    }

    public boolean retainAll(Collection<?> c) {
        boolean succeed = true;
        Iterator<T> iterator=iterator();
        while (iterator.hasNext()){
            T o=iterator.next();
            if(!c.contains(o)){
                if(!remove(o)){
                    succeed=false;
                }
            }
        }
        return succeed;
    }

    public boolean removeAll(Collection<?> c) {
        boolean succeed = true;
        Iterator<T> iterator=iterator();
        while (iterator.hasNext()){
            T o=iterator.next();
            if(c.contains(o)){
                if(!remove(o)){
                    succeed=false;
                }
            }
        }
        return succeed;
    }


    /**
     * clear
     */

    public void clear() {
        count = 0;
        capacity = 1;
        items = new Object[capacity];
    }



    /**
     * increaseCapacity
     */
    private void increaseCapacity() {
        capacity = capacity * 2;
        Object[] tmp = new Object[capacity];
        for (int i = 0; i < count; i++) {
            tmp[i] = items[i];
        }
        items = tmp;
    }

    /**
     * shiftLeft
     */

    private void shiftLeft(Object[] items, int index, int count) {
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
    }
}

