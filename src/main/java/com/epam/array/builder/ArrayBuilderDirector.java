package com.epam.array.builder;

import com.epam.array.entity.Array;

public class ArrayBuilderDirector {

    private final ArrayBuilder arrayBuilder;

    public ArrayBuilderDirector(ArrayBuilder arrayBuilder) {
        this.arrayBuilder = arrayBuilder;
    }

    public Array buildArray() {
        arrayBuilder.createArray();
        arrayBuilder.buildValues();
        return arrayBuilder.getArray();
    }

}
