package com.epam.array.builder;

import com.epam.array.entity.Array;

import java.util.Random;

public class RandomArrayBuilder extends ArrayBuilder {

    private static final int UPPER_BOUND = 192;

    @Override
    public void createArray() {
        Random random = new Random();
        int length = random.nextInt(UPPER_BOUND);
        array = new Array(length);
    }

    @Override
    public void buildValues() {
        Random random = new Random();
        for (int i = 0; i < array.size(); i++) {
            array.set(i, random.nextInt(UPPER_BOUND));
        }
    }
}
