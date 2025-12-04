package com.fellon.filtering;

public class FilterUtils {
    public static <T>T[]filter(T[] array, Filter<T> filter){
        T[] result = array.clone();
        for (int i = 0; i < array.length; i++) {
            result[i] = filter.apply(array[i]);
        }
        return result;
    }
}
