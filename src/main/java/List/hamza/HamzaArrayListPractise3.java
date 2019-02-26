package List.hamza;



import java.util.*;

public class HamzaArrayListPractise3<T> implements List<T>{
    int count = 0;
    int capacity = 1;
    Object [] items = new Object[capacity];


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

            int index = -1;
            @Override
            public boolean hasNext() {
                return size() > 0 && index<size();
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
        Object[] arr = new Object[count];
        for (int i=0 ;i<count; i++){
            arr[i] = items[i];
        }
        return arr;
    }


    public <T1> T1[] toArray(T1[] a) {
        T1[] arr = (T1[]) new Object[count];
        for(int i=0; i<count; i++){
            arr[i] = (T1)items[i];
        }
        return arr;
    }


    public boolean add(T t) {
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
        for(int i=0; i<count; i++){
            temp[i] = items[i];

        }
        items = temp;
    }


    public boolean remove(Object o) {
        int index = indexOf(o);
        if(index<0) return false;
        shiftLeft(items,index,count);
        count--;
        return true;
    }


    public boolean containsAll(Collection<?> c) {
        for(Object o: c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;

    }


    public boolean addAll(Collection<? extends T> c) {
        boolean succeed = true;
        for(T e : c){
            if(!add(e)){
                succeed = false;
            }
        }
        return succeed;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
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


    public boolean retainAll(Collection<?> c) {
        boolean succeed = true;
        Iterator<T> iterator = iterator();
        while(iterator.hasNext()){
            if(!c.contains(iterator.next())){
                if(!remove(iterator.next())){
                    succeed = false;
                }
            }
        }
        return succeed;
    }


    public void clear() {
        count=0;
        capacity=1;
        items = new Object[capacity];
    }


    public T get(int index) {
        return (T) items[index];
    }


    public T set(int index, T element) {
        return (T) (items[index] = element);
    }


    public void add(int index, T element) {
        if(capacity<count+1){
            increaseCapacity();
        }
        shiftRight(items, index, count);
        items[index] =element;
        count++;
    }

    private void shiftRight(Object[] items, int index, int count) {
        for(int i=count; i>index; i--){
            items[i] = items[i-1];
        }
    }


    public T remove(int index) {
        if(index<0) return null;
        shiftLeft(items,index,count);
        count--;
        return (T) items;
    }

    private void shiftLeft(Object[] items, int index, int count) {
        for(int i=0; i<count; i++){
            items[i] =items[i+1];
        }
    }


    public int indexOf(Object o) {
        for(int i=0; i<count; i++){
            if (items[i] == o){
                return i;
            }
        }
        return -1;
    }


    public int lastIndexOf(Object o) {
        for(int i=count; i>0; i--){
            if(items[i] == o){
                return i;
            }

        }
        return -1;
    }


    public ListIterator<T> listIterator() { return null;}
    public ListIterator<T> listIterator(int index) {return null;}


    public List<T> subList(int fromIndex, int toIndex) {
        List<Integer> subList = new ArrayList<>();
        for(int i=fromIndex; i<toIndex; i++){
            subList.add(i);
        }
        return (List<T>) subList;
    }
}
