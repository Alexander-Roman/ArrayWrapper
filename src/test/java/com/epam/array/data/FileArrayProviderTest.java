package com.epam.array.data;

import com.epam.array.entity.Array;
import com.epam.array.exception.DataException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileArrayProviderTest {

    public static final String EMPTY_FILE = "src/test/resources/FileArrayBuilderInputTestEmpty";
    public static final String LOST_FILE = "src/test/resources/FileArrayBuilderInputTestLost";
    private static final String CORRECT_FILE = "src/test/resources/FileArrayBuilderInputTest";

    @Test
    public void getArrayTestShouldReturnCorrectArrayFromFile() throws DataException {
        //given
        ArrayProvider provider = new FileArrayProvider(CORRECT_FILE);
        int[] arr = new int[]{50, 56, 3, 89, -84, 37, 59, 55, -6, -21, 13, 38, 45, 64, 67, -36, 42};
        Array expected = new Array(arr);
        //when
        Array actual = provider.getArray();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getArrayTestShouldReturnNotNull() throws DataException {
        //given
        ArrayProvider provider = new FileArrayProvider(CORRECT_FILE);
        //when
        Array actual = provider.getArray();
        //then
        Assert.assertNotNull(actual);
    }

    @Test
    public void getArrayTestShouldReturnZeroLengthArrayFromEmptyFile() throws DataException {
        //given
        ArrayProvider provider = new FileArrayProvider(EMPTY_FILE);
        Array expected = new Array(0);
        //when
        Array actual = provider.getArray();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test(expectedExceptions = DataException.class)
    public void getArrayTestShouldThrowRuntimeExceptionWhenFileLost() throws DataException {
        //given
        ArrayProvider provider = new FileArrayProvider(LOST_FILE);
        //when
        provider.getArray();
    }
}
