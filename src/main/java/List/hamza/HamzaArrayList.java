package List.hamza;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class HamzaArrayList<T> implements List<T> {
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
        for (int i = 0; i < size(); i++) {
            if (items[i] == o) {
                return true;
            }

        }
        return false;
    }

    public Iterator<T> iterator() {
        if (count > 0) {
            return (Iterator<T>) Arrays.asList(items).subList(0, count - 1).iterator();
        } else {
            return (Iterator<T>) Iterators.empty();
        }
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

    public boolean add(T s) {
        if (capacity < count + 1) {
            increaseCapacity();
        }
        items[count] = s;
        count++;
        return true;
    }


    /**
     * remove
     */

    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index < 0) return false;
        shiftLeft(items, index, count);
        count--;
        return true;

    }

    public boolean containsAll(Collection<?> c) {
        int count = 0;
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Object item = it.next();
            if (contains(item)) {
                count++;
                break;
            }
        }
        return c.size() == count;

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


    /**
     * clear
     * however test is not passed yet
     */
    public void clear() {
        count = 0;
        capacity = 1;
        items = new Object[capacity];
    }


    /**
     * get
     */

    public T get(int index) {
        return (T) items[index];
    }


    /**
     * set
     */


    public T set(int index, T element) {
        return (T) (items[index] = element);
    }


    /**
     * add with index
     * <p>
     * test passes but not correctly!!!
     */


    public void add(int index, T element) {
        if (capacity < count + 1) {
            increaseCapacity();
        }
        shiftRight(items, index, count);
        items[index] = element;
        count++;
    }


    public T remove(int index) {
        if (index < 0) return null;
        T item = get(index);
        shiftLeft(items, index, count);
        count--;
        return item;
    }


    /**
     * indexOf
     */

    public int indexOf(Object o) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == o)
                return i;
        }
        return -1;
    }

    /**
     * lastIndexOf
     */


    public int lastIndexOf(Object o) {

        for (int i = count; i >= 0; i--) {
            if (items[i] == o) {
                return i;
            }
        }

        return -1;
    }


    public ListIterator<T> listIterator() {
        throw new NotImplementedException();
    }

    public ListIterator<T> listIterator(int index) {throw new NotImplementedException();}


    /**
     * subList
     * <p>
     * however test is not passed yet
     */

    public List<T> subList(int fromIndex, int toIndex) {

        List<Integer> sublist = new HamzaArrayList<Integer>();

        for (int i = fromIndex; i < toIndex; i++) {
            sublist.add(i);
        }

        return (List<T>) sublist;
    }

    /**
     * Increase Capacity
     */

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

    private void shiftRight(Object[] items, int index, int count) {
        for (int i = count; i > index; i--) {
            items[i] = items[i - 1];
        }
    }
}
