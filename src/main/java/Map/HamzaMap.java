package Map;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HamzaMap <T> implements Map<T, T> {


    public int size() {
        throw new NotImplementedException();
    }

    public boolean isEmpty() {
        throw new NotImplementedException();
    }

    public boolean containsKey(Object key) {
        throw new NotImplementedException();
    }

    public boolean containsValue(Object value) {
        throw new NotImplementedException();
    }

    public T get(Object key) {
        throw new NotImplementedException();
    }

    public T put(T key, T value) {
        throw new NotImplementedException();
    }

    public T remove(Object key) {
        throw new NotImplementedException();
    }

    public void putAll(Map<? extends T, ? extends T> m) {
        throw new NotImplementedException();
    }

    public void clear() {
        throw new NotImplementedException();
    }

    public Set<T> keySet() {
        throw new NotImplementedException();
    }

    public Collection<T> values() {
        throw new NotImplementedException();
    }

    public Set<Entry<T, T>> entrySet() {
        throw new NotImplementedException();
    }

    public T getOrDefault(Object key, T defaultValue) {
        throw new NotImplementedException();
    }



    public void replaceAll(BiFunction<? super T, ? super T, ? extends T> function) {
        throw new NotImplementedException();
    }

    public T putIfAbsent(T key, T value) {
        throw new NotImplementedException();
    }

    public boolean remove(Object key, Object value) {
        throw new NotImplementedException();
    }

    public boolean replace(T key, T oldValue, T newValue) {
        throw new NotImplementedException();
    }

    public T replace(T key, T value) {
        throw new NotImplementedException();
    }

    public T computeIfAbsent(T key, Function<? super T, ? extends T> mappingFunction) {
        throw new NotImplementedException();
    }

    public T computeIfPresent(T key, BiFunction<? super T, ? super T, ? extends T> remappingFunction) {
        throw new NotImplementedException();
    }

    public T compute(T key, BiFunction<? super T, ? super T, ? extends T> remappingFunction) {
        throw new NotImplementedException();
    }

    public T merge(T key, T value, BiFunction<? super T, ? super T, ? extends T> remappingFunction) {
        throw new NotImplementedException();
    }
}
