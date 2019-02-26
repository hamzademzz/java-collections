package Map;


import java.util.*;
import java.util.function.BiFunction;

public class HamzaMapPractise5<K,V> implements Map<K,V> {

    int count = 0;
    Set<Map.Entry<K,V>> entrySet = new HashSet<>();

    class HamzaEntry implements Map.Entry<K,V> {
        K key;
        V value;

        public HamzaEntry (K key, V value){
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
    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private Map.Entry<K,V> getEntry(K key){
        for(Map.Entry<K,V> entry : entrySet){
            if(entry.getKey() == key){
                return entry;
            }
        }
        return null;
    }

    public boolean containsKey(Object key) {
        return getEntry((K) key) != null;
    }


    private  Map.Entry<K,V> getEntryByValue(V value){
        for(Map.Entry<K,V> entry : entrySet){
            if(entry.getValue() == value){
                return entry;
            }
        }
        return null;
    }
    public boolean containsValue(Object value) {
        return getEntryByValue((V) value) != null;
    }

    public V get(Object key) {
        Entry<K, V> entry = getEntry((K) key);
        if(entry!=null){
            return entry.getValue();
        }
        return null;

    }

    public V put(K key, V value) {
        Entry<K, V> entry = getEntry(key);
        if(entry!=null){
            entry.setValue(value);
            return entry.getValue();
        }else{
            HamzaEntry hamzaEntry = new HamzaEntry(key,value);
            entrySet.add(hamzaEntry);
            count++;
            return hamzaEntry.getValue();
        }

    }

    public V remove(Object key) {
        Entry<K, V> entry = getEntry((K) key);
        if(entry!=null){
            entrySet.remove(entry);
            count--;
            return entry.getValue();
        }
        return null;

    }

    public void putAll(Map<? extends K, ? extends V> m) {

    }

    public void clear() {
        entrySet.clear();
        count = 0;
    }

    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        for(Map.Entry<K,V> entry : entrySet){
            keys.add(entry.getKey());
        }
        return keys;
    }

    public Collection<V> values() {
        List<V> values = new ArrayList<>();
        for(Map.Entry<K,V> entry : entrySet){
            values.add(entry.getValue());
        }
        return values;
    }

    public Set<Entry<K, V>> entrySet() {
        return entrySet;
    }

    public V getOrDefault(Object key, V defaultValue) {
        Entry<K, V> entry = getEntry((K) key);
        if(entry!=null){
            return entry.getValue();
        }
        return defaultValue;

    }

    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {

    }

    public V putIfAbsent(K key, V value) {
        V v = get(key);
        if(v == null){
            put(key,value);
        }
        return null;
    }

    public boolean remove(Object key, Object value) {
        Entry<K, V> entry = getEntry((K) key);
        if(entry!=null){
            entrySet.remove(entry);
            count--;
            return true;
        }
        return false;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        if(((get(oldValue)) != null) || containsKey(key)){
            put(key,newValue);
            return true;
        }
        return false;
    }

    public V replace(K key, V value) {
        V curValue;

        if(((curValue = get(key)) != null) || containsKey(key)){
            curValue = put(key,value);
        }
        return curValue;
    }
}
