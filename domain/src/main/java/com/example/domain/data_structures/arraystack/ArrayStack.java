package com.example.domain.data_structures.arraystack;

import java.util.Arrays;

public class ArrayStack<T> implements IStack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] store;
    private int size = 0;
    private int capacity;


    public ArrayStack() {
        this.capacity = DEFAULT_CAPACITY;
        store = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        store = (T[]) new Object[capacity];
    }

    @Override
    public boolean push(T value) {
        if (this.size >= store.length) {
            int newSize = size + (size >> 1);
            store = Arrays.copyOf(store, newSize);
        }
        store[size++] = value;
        return true;
    }

    @Override
    public T pop() {
        if (size <= 0) {
            return null;
        }

        T value = store[--size];
        store[size] = null;

        return value;
    }

    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
