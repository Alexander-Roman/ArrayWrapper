package com.epam.array.logic;

import com.epam.array.entity.Array;

public class ArrayHandler {

    public int binarySearchIndexOf(Array sortedArray, int value) {
        int from = 0;
        int to = sortedArray.size() - 1;

        while (from <= to) {
            int middle = (from + to) / 2;
            int midValue = sortedArray.get(middle);

            if (value == midValue) {
                return middle;
            } else if (value > midValue) {
                from = middle + 1;
            } else {
                to = middle - 1;
            }
        }

        return -1;
    }

}
