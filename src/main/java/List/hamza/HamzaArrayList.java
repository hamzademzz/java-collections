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

    private void increaseCapacity(){
        capacity=capacity*2;
        Object[] tmp=new Object[capacity];
        for(int i=0;i<items.length;i++){
            tmp[i]=items[i];
        }
        items=tmp;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        throw new NotImplementedException();
    }

    public boolean contains(Object o) {
        throw new NotImplementedException();
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

    public T get(int index) {
        throw new NotImplementedException();
    }

    public T set(int index, T element) {
        throw new NotImplementedException();
    }

    public void add(int index, T element) {
        throw new NotImplementedException();
    }

    public T remove(int index) {
        throw new NotImplementedException();
    }

    public int indexOf(Object o) {
        throw new NotImplementedException();
    }

    public int lastIndexOf(Object o) {
        throw new NotImplementedException();
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
