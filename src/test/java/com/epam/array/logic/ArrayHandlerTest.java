package com.epam.array.logic;

import com.epam.array.entity.Array;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayHandlerTest {

    private final ArrayHandler handler = new ArrayHandler();

    @Test
    public void binarySearchIndexOfTestShouldReturnCorrectIndexWhenArraySizeIsEven() {
        //given
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        Array given = new Array(arr);
        //when
        int actual = handler.binarySearchIndexOf(given, 5);
        //then
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearchIndexOfTestShouldReturnCorrectIndexWhenArraySizeIsOdd() {
        //given
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Array given = new Array(arr);
        //when
        int actual = handler.binarySearchIndexOf(given, 2);
        //then
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearchIndexOfTestShouldReturnNegativeWhenArrayDoesNotContainValue() {
        //given
        int[] arr = new int[]{1, 2, 4, 5, 6, 7, 8};
        Array given = new Array(arr);
        //when
        int actual = handler.binarySearchIndexOf(given, 3);
        //then
        Assert.assertTrue(actual < 0);
    }


}
