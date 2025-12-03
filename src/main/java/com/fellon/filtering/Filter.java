package com.fellon.filtering;

public interface Filter <T>{
    T apply(T o);
}
