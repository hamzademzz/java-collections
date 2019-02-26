package Map;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HamzaMap<K, V> implements Map<K, V> {

    int count = 0;
    Set<Map.Entry<K, V>> entrySet = new HashSet<>();


    class HamzaEntry<K, V> implements Map.Entry<K, V> {
        K key;
        V value;

        public HamzaEntry(K key,V value){
            this.key=key;
            this.value=value;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            this.value=value;
            return this.value;
        }
    }




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
     * containsKey
     */

    private Map.Entry<K,V> getEntry(K key){
        for (Map.Entry<K, V> entry : entrySet) {
            if (entry.getKey() == key) {
                return entry;
            }
        }
        return null;
    }

    private Map.Entry<K,V> getEntryByValue(V value){
        for (Map.Entry<K, V> entry : entrySet) {
            if (entry.getValue() == value) {
                return entry;
            }
        }
        return null;
    }

    public boolean containsKey(Object key) {
        return getEntry((K)key)!=null;
    }

    /**
     * containsValue
     */

    public boolean containsValue(Object value) {
        return getEntryByValue((V)value)!=null;
    }

    /**
     * get
     */

    public V get(Object key) {
        Entry<K, V> entry = getEntry((K) key);
        if(entry!=null) return entry.getValue();
        return null;
    }

    /**
     * put
     */

    public V put(K key, V value) {
        Entry<K, V> entry = getEntry(key);
        if(entry!=null){
            entry.setValue(value);
            return entry.getValue();
        }else{
            Map.Entry<K, V> hamzaEntry = new HamzaEntry<>(key,value);
            entrySet.add(hamzaEntry);
            count++;
            return hamzaEntry.getValue();
        }
    }

    /**
     * remove
     */

    public V remove(Object key) {
        Entry<K, V> entry = getEntry((K) key);
        if(entry!=null){
            entrySet.remove(entry);
            count--;
            return entry.getValue();
        }
        return null;

    }


    /**
     * putAll  throw new NotImplementedException();
     */
    public void putAll(Map<? extends K, ? extends V> m) {
        throw new NotImplementedException();
    }


    /**
     * clear
     */

    public void clear() {
        count = 0;
        entrySet.clear();
    }

    /**
     * keySet TEST
     */
    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        for(Map.Entry<K,V> entry:entrySet){
            keys.add(entry.getKey());
        }

        return keys;
    }

    /**
     * values TEST
     */

    public Collection<V> values() {
        List<V> values = new ArrayList<>();

        for(Map.Entry<K,V> entry:entrySet){
            values.add(entry.getValue());
        }


        return  values;
    }


    /**
     * entrySet TEST
     */

    public Set<Entry<K, V>> entrySet() {
        return entrySet;
    }


    /**
     * getOrDefault TEST
     */

    public V getOrDefault(Object key, V defaultValue) {

        Entry<K, V> entry = getEntry((K) key);
        if(entry!=null)return entry.getValue();
        return defaultValue;
    }


    /**
     * putIfAbsent
     */

    public V putIfAbsent(K key, V value) {

        V v = get(key);
        if (v == null) {
            v = put(key, value);
        }

        return v;
    }


    /**
     * remove TEST
     */

    public boolean remove(Object key, Object value) {
        Entry<K, V> entry = getEntry((K) key);
        if(entry!=null){
            entrySet.remove(entry);
            count--;
            return true;
        }
        return false;
    }



    /**
     * replace TEST
     */
    public boolean replace(K key, V oldValue, V newValue) {

        if((get(oldValue)  != null) || containsKey(key)){
            put(key,newValue);
            return true;
        }
        return false;
    }

    /**
     * replace TEST
     */

    public V replace(K key, V value) {
        V curValue;
        if (((curValue = get(key)) != null) || containsKey(key)) {
            curValue = put(key, value);
        }
        return curValue;
    }


    /**
     * replaceAll  throw new NotImplementedException();
     */

    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
        throw new NotImplementedException();

    }





























    private void test() {
        Map<K, V> m = new HashMap<>();
        List<K> l = new ArrayList<>();
    }












    public void forEach(BiConsumer<? super K, ? super V> action) {
        throw new NotImplementedException();
    }


    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
        throw new NotImplementedException();
    }

    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        throw new NotImplementedException();
    }

    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        throw new NotImplementedException();
    }

    public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        throw new NotImplementedException();
    }

}
