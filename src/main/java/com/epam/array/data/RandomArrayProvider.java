package com.epam.array.data;

import com.epam.array.entity.Array;

import java.util.Random;

public class RandomArrayProvider implements ArrayProvider {

    private static final int UPPER_BOUND = 192;

    @Override
    public Array getArray() {
        Array array = createArray();
        fillArray(array);
        return array;
    }

    private Array createArray() {
        Random random = new Random();
        int length = random.nextInt(UPPER_BOUND);
        return new Array(length);
    }

    private void fillArray(Array array) {
        Random random = new Random();
        for (int i = 0; i < array.size(); i++) {
            array.set(i, random.nextInt(UPPER_BOUND));
        }
    }
}
