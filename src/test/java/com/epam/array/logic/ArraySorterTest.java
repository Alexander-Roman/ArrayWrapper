package com.epam.array.logic;

import com.epam.array.entity.Array;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySorterTest {

    private final ArraySorter sorter = new ArraySorter();

    @Test
    public void sortBubbleTestShouldSortAscending() {
        //given
        int[] unsorted = new int[]{5, 4, 3, 2, 1};
        int[] sorted = new int[]{1, 2, 3, 4, 5};
        Array given = new Array(unsorted);
        //when
        Array actual = sorter.sortBubble(given);
        //then
        Array expected = new Array(sorted);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortBubbleTestShouldDoNothingWhenSorted() {
        //given
        int[] sorted = new int[]{1, 2, 3, 4, 5};
        Array given = new Array(sorted);
        //when
        Array actual = sorter.sortBubble(given);
        //then
        Array expected = new Array(sorted);
        Assert.assertEquals(expected, actual);
    }
}
