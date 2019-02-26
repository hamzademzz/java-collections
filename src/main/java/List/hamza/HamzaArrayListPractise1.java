package List.hamza;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HamzaArrayListPractise1<T> implements List<T> {
    int count = 0;
    int capacity = 1;
    Object[] items = new Object[capacity];

    private void increaseCapacity() {
        capacity = capacity * 2;
        Object[] temp = new Object[capacity];

        for (int i = 0; i < size(); i++) {
            temp[i] = items[i];
        }
        items = temp;
    }


    /**
     * Done
     */
    public int size() {
        return count;
    }


    /**
     * Done
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Done
     */
    public boolean contains(Object o) {
        for (int i = 0; i < size(); i++) {
            if (items[i] == o) {
                return true;
            }
        }
        return false;
    }

    /**
     * Done
     */
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            int _index = -1;

            @Override
            public boolean hasNext() {
                return size() > 0 && _index < size() - 1;
            }

            @Override
            public T next() {
                _index++;
                return (T) items[_index];
            }
        };
        return iterator;
    }


    /**
     * Done
     */
    public Object[] toArray() {
        Object[] arr = new Object[count];
        for (int i = 0; i < count; i++) {
            arr[i] = items[i];
        }
        return arr;
    }

    /**
     * Done
     */
    public <T1> T1[] toArray(T1[] a) {
        T1[] arr = (T1[]) new Object[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (T1) items[i];
        }
        return arr;

    }

    /**
     * Done
     */
    public boolean add(T t) {
        if (capacity < count + 1) {
            increaseCapacity();
        }
        items[count] = t;
        count++;
        return true;

    }

    /**
     * Done
     */
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index < 0) return false;
        shiftLeft(items, index, count);
        count--;
        return true;
    }


    /**
     * Done
     */
    public boolean containsAll(Collection<?> c) {
        Iterator<?> iterator = c.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (!contains(next)) {
                return false;
            }
        }
        return true;
    }


    /**
     * Done
     */


    public boolean addAll(Collection<? extends T> c) {
        boolean succeed = true;
        for (T e : c) {
            if (!add(e)) {
                succeed = false;
            }
        }
        return succeed;
    }


    /**
     * NOT SURE IF THIS IS CORRECT AND WHY IS GET NOT WORKING???
     */

    public boolean addAll(int index, Collection<? extends T> c) {

        int initialSize = this.size();


        for (int i = 0; i < c.size(); i++) {
            T e = get(i);   //why doesnt c.get(i) work
            add(index + i, e);

        }

        int FinalSize = this.size();
        if (initialSize == FinalSize) {
            return false;
        }
        return true;


    }

    /**
     * Done
     */
    public boolean removeAll(Collection<?> c) {
        boolean succeed = true;
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            T o = iterator.next();
            if (c.contains(o)) {
                if (!remove(o)) {
                    succeed = false;
                }
            }
        }
        return succeed;
    }

    /**
     * Done but not learnt
     */
    public boolean retainAll(Collection<?> c) {
        boolean succeed = true;
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            T o = iterator.next();
            if (!c.contains(o)) {
                if (!remove(o)) {
                    succeed = false;
                }
            }
        }
        return succeed;
    }


    /**
     * Done
     */
    public void clear() {
        count = 0;
        capacity = 1;
        items = new Object[capacity];

    }

    /**
     * Done
     */
    public T get(int index) {
        return (T) items[index];
    }


    /**
     * Done
     */
    public T set(int index, T element) {
        return (T) (items[index] = element);
    }

    /**
     * Done
     */
    public void add(int index, T element) {
        if (capacity < count + 1) {
            increaseCapacity();
        }
        shiftRight(items, index, count);
        items[index] = element;
        count++;
    }


    /**
     * Done
     */
    public T remove(int index) {
        if (index < 0) return null;
        T item = get(index);
        shiftLeft(items, index, count);
        count--;
        return item;
    }

    /**
     * Done
     */
    public int indexOf(Object o) {
        for (int i = 0; i < count; i++) {
            if (items[i] == o) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Done
     */
    public int lastIndexOf(Object o) {

        for (int i = count - 1; i >= 0; i--) {
            if (items[i] == o) {
                return i;
            }
        }
        return -1;
    }


    /////////////////////////////////////////////////////////////
    public ListIterator<T> listIterator() {
        return null;
    }

    public ListIterator<T> listIterator(int index) {
        return null;
    }
    /////////////////////////////////////////////////////////////


    /**
     * Done
     */
    public List<T> subList(int fromIndex, int toIndex) {

        List<Integer> subList = new HamzaArrayListPractise1<Integer>();

        for (int i = fromIndex; i < toIndex; i++) {
            subList.add(i);
        }
        return (List<T>) subList;
    }

    /**
     * Done
     */
    private void shiftLeft(Object[] items, int index, int count) {
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
    }
    /**
     * Done
     */
    /**
     * this only works if it is List<Integer> ????WHY>>>>>?????
     */
    private void shiftRight(Object[] items, int index, int count) {
        for (int i = count; i > index; i--) {
            items[i] = items[i - 1];
        }
    }


}
