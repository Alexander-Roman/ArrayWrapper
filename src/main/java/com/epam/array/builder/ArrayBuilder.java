package com.epam.array.builder;

import com.epam.array.entity.Array;

public abstract class ArrayBuilder {

    Array array; // package-private access

    public abstract void createArray();

    public abstract void buildValues();

    public Array getArray() {
        return array;
    }

}
