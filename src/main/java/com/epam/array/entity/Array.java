package com.epam.array.entity;

import java.util.Arrays;

public class Array implements Copyable {

    private final int[] arr;

    public Array(int length) {
        this.arr = new int[length];
    }

    public Array(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public Array copy() {
        int size = this.size();
        Array copied = new Array(size);
        for (int i = 0; i < size; i++) {
            copied.set(i, this.get(i));
        }
        return copied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Arrays.equals(arr, array.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

}
