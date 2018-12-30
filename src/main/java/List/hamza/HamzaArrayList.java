package List.hamza;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HamzaArrayList<T> implements List<T>{
    int count=0;
    int capacity=1;
    Object[] items= new Object[capacity];

    /**
     Increase Capacity
     */

    private void increaseCapacity(){
        capacity=capacity*2;
        Object[] tmp=new Object[capacity];
        for(int i=0;i<items.length;i++){
            tmp[i]=items[i];
        }
        items=tmp;
    }

    /**
     size
     */
    public int size() {
        return count;
    }

    /**
     isEmpty
     */

    public boolean isEmpty() {

        return items.length ==0;
    }

    /**
     contains
     */

    public boolean contains(Object o) {

        for (int i=0; i<items.length; i++){
            if (items[i] == o){
                return true;
            }

        }
        return false;
    }

    public Iterator<T> iterator() {
        throw new NotImplementedException();
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T> T[] toArray(T[] a) {
        throw new NotImplementedException();
    }

    /**
     add
     */

    public boolean add(T s) {
        if (capacity< count+1){
            increaseCapacity();
        }
        items[count]=s;
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

    public boolean addAll(int index, Collection<? extends T> c) {
        throw new NotImplementedException();
    }

    public boolean removeAll(Collection<?> c) {
        throw new NotImplementedException();
    }

    public boolean retainAll(Collection<?> c) {
        throw new NotImplementedException();
    }

    public void clear() {
        throw new NotImplementedException();
    }

    /**
     get
     */

    public T get(int index) {

       return (T) items[index];
    }


    /**
     set
     */


    public T set(int index, T element) {

        return (T) (items[index]= element);


    }

    public void add(int index, T element) {
        throw new NotImplementedException();
    }

    public T remove(int index) {
        throw new NotImplementedException();
    }

    /**
     indexOf
     */

    public int indexOf(Object o) {

        for (int i=0; i< items.length; i++){
            if (items[i] == o)
                return i;
        }
        return -1;
    }

    /**
     lastIndexOf
     */


    public int lastIndexOf(Object o) {

        for (int i=items.length -1 ; i>=0; i--){
            if (items[i] == o){
                return i;
            }
        }

        return -1;
    }

    public ListIterator<T> listIterator() {
        throw new NotImplementedException();
    }

    public ListIterator<T> listIterator(int index) {
        throw new NotImplementedException();
    }

    public List<T> subList(int fromIndex, int toIndex) {
        throw new NotImplementedException();
    }
}
