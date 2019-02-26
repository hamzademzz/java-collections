package Set;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class HamzaSetPractise1<T> implements Set<T> {
        int count=0;
        int capacity=1;
        Object[] items = new Object[capacity];

    public int size() {
        return count;
    }


    public boolean isEmpty() {
        return size() == 0;
    }


    public boolean contains(Object o) {
        for(int i=0; i<count; i++){
            if(items[i] == o){
                return true;
            }
        }
        return false;
    }


    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            int index=0;
            @Override
            public boolean hasNext() {
                return size()>0 && index<size();
            }

            @Override
            public T next() {
                index++;
                return (T) items[index];
            }
        };
        return iterator;
    }


    public Object[] toArray() {
        Object [] arr = new Object[count];
        for(int i=0; i<count; i++){
            arr[i] = items[i];
        }
        return arr;
    }


    public <T1> T1[] toArray(T1[] a) {
        T [] arr = (T[]) new Object[count];
        for(int i=0;i<count;i++){
            arr[i] = (T) items[i];
        }
        return (T1[]) arr;
    }


    public boolean add(T t) {
        for(int i=0; i<count; i++){
            if(items[i] == t){
                return false;
            }
        }

        if(capacity<count+1){
            increaseCapacity();
        }
        items[count] = t;
        count++;
        return true;

    }

    private void increaseCapacity() {
        capacity = capacity * 2;
        Object[] temp = new Object[capacity];
        for (int i=0; i<count; i++){
            temp[i] = items[i];
        }
        items=temp;
    }


    public boolean remove(Object o) {
        int index=0;
        for(int i=0; i<count; i++){
            if (items[i] == o){
                index = i;
            }
        }
        shiftLeft(items,index,count);
        count--;
        return true;

    }

    private void shiftLeft(Object[] items, int index, int count) {
        for(int i=index; i<count; i++){
            items[i] = items[i+1];
        }
    }


    public boolean containsAll(Collection<?> c) {
        for(Object o : c){
            if(!contains(o)){
                return false;
            }
        }
        return true;
    }



    public boolean addAll(Collection<? extends T> c) {
        boolean succeed = true;
        for(T e: c){
            if(!add(e)){
                succeed = false;
            }
        }
        return succeed;
    }


    public boolean retainAll(Collection<?> c) {
        boolean succeed = true;
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()){
            if(!c.contains(iterator.next())){
                if(!remove(iterator.next())){
                    succeed = false;
                }
            }
        }
        return succeed;
    }


    public boolean removeAll(Collection<?> c) {
        boolean succeed = true;
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()){
            if(c.contains(iterator.next())){
                if(!remove(iterator.next())){
                    succeed = false;
                }
            }
        }
        return succeed;
    }


    public void clear() {
        count = 0;
        capacity = 1;
        items = new Object[capacity];
    }
}
