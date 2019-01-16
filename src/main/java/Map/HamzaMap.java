package Map;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HamzaMap <T, S> implements Map<T, S> {

    int count = 0;
    int capacity = 2;
    Object[] items = new Object[capacity];


    /**
     * size
     */

    public int size() {
        return count/2;
    }


    /**
     * isEmpty
     */

    public boolean isEmpty() {
        return size()==0;
    }

    /**
     * containsKey
     */

    public boolean containsKey(Object key) {

        for(int i=0; i<count; i++){
            if (i% 2 == 0){
                if (items[i] == key){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * containsValue
     */

    public boolean containsValue(Object value) {
        for(int i=0; i<count; i++){
            if (i% 2 != 0){
                if (items[i] == value){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * get
     */

    public S get(Object key) {

        for (int i=0; i<count; i++) {
            if (items[i] == key){
                return (S)items[i+1];
            }
        }

        return (S) items;
    }

    /**
     * put
     */

    public S put(T key, S value) {
        if (capacity < count + 1) {
            increaseCapacity();
        }
        items[count] = key;
        count++;
        items[count]=value;
        count++;
        return (S) items;
    }

    /**
     * remove
     */

    public S remove(Object key) {
        int index = 0;

        for(int i=0; i<size(); i++){
            if (i% 2 == 0){
                if(items[i] == key){
                index = i;
                }
            }
        }

        shiftLeft(items, index, count);
        count= count -2;
        return (S) items;

    }



    public void putAll(Map<? extends T, ? extends S> m) {
        throw new NotImplementedException();
    }



    /**
     * clear
     */

    public void clear() {
        count = 0;
        int capacity = 2;
        items = new Object[capacity];
    }

    /**
     * keySet
     */
    public Set<T> keySet() {
        Set<T> keys = new HashSet<>();

        for(int i=0; i<count; i++){
            if(i%2 == 0){
                keys.add((T) items[i]);
            }
        }

        return keys;
    }

    /**
     * values
     */

    public Collection<S> values() {
        List<T> values = new ArrayList<>();

        for(int i=0; i<count; i++){
            if(i%2 != 0){
                values.add((T) items[i]);
            }
        }

        return (Collection<S>) values;
    }


    /**
     * entrySet not sure how to do this
     */

    public Set<Entry<T, S>> entrySet() {
        List<T> values = new ArrayList<>();

        for(int i=0; i<count; i++){
            values.add((T) items[i]);
        }

        Set<T> entrySet = new HashSet<>();

        for(int i=0; i<size(); i++){
            entrySet.add((T) (values.get(i) + " = " + values.get(i+1)));
        }


        return (Set<Entry<T, S>>) entrySet;
    }


    /**
     * getOrDefault
     */

    public S getOrDefault(Object key, S defaultValue) {

        for(int i=0; i<count; i++){
            if(i%2 == 0){
                if(items[i] == key){
                    return (S) items[i+1];
                }

            }
        }

        return defaultValue;
    }




    /**
     * forEach
     */


    public void forEach(BiConsumer<? super T, ? super S> action) {
        throw new NotImplementedException();
    }


    public void replaceAll(BiFunction<? super T, ? super S, ? extends S> function) {
        throw new NotImplementedException();
    }










    /**
     * forEach
     */

    public S putIfAbsent(T key, S value) {
        throw new NotImplementedException();
    }

    public boolean remove(Object key, Object value) {
        throw new NotImplementedException();
    }

    public boolean replace(T key, S oldValue, S newValue) {
        throw new NotImplementedException();
    }

    public S replace(T key, S value) {
        throw new NotImplementedException();
    }











    public S computeIfAbsent(T key, Function<? super T, ? extends S> mappingFunction) {
        throw new NotImplementedException();
    }

    public S computeIfPresent(T key, BiFunction<? super T, ? super S, ? extends S> remappingFunction) {
        throw new NotImplementedException();
    }

    public S compute(T key, BiFunction<? super T, ? super S, ? extends S> remappingFunction) {
        throw new NotImplementedException();
    }

    public S merge(T key, S value, BiFunction<? super S, ? super S, ? extends S> remappingFunction) {
        throw new NotImplementedException();
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
            items[i] = items[i + 2];
        }
    }
}
