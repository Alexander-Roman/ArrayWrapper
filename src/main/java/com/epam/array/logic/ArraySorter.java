package com.epam.array.logic;

import com.epam.array.entity.Array;

public class ArraySorter {

    public Array sortBubble(Array array) {
        Array sorted = array.copy();
        int range = sorted.size();
        int shifts;
        do {
            shifts = 0;
            for (int i = 0; i < range - 1; i++) {
                if (sorted.get(i) > sorted.get(i + 1)) {
                    int temp = sorted.get(i);
                    sorted.set(i, sorted.get(i + 1));
                    sorted.set(i + 1, temp);
                    shifts++;
                }
            }
            range--;
        } while (shifts > 0);
        return sorted;
    }
}
