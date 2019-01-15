package Map;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
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

    public void clear() {
        throw new NotImplementedException();
    }

    public Set<T> keySet() {
        throw new NotImplementedException();
    }

    public Collection<S> values() {
        throw new NotImplementedException();
    }

    public Set<Entry<T, S>> entrySet() {
        throw new NotImplementedException();
    }

    public S getOrDefault(Object key, S defaultValue) {
        throw new NotImplementedException();
    }


    public void forEach(BiConsumer<? super T, ? super S> action) {
        throw new NotImplementedException();
    }

    public void replaceAll(BiFunction<? super T, ? super S, ? extends S> function) {
        throw new NotImplementedException();
    }

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
            items[i] = items[i + 2];
        }
    }
}
