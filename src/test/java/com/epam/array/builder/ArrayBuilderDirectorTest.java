package com.epam.array.builder;

import com.epam.array.entity.Array;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayBuilderDirectorTest {

    @Test
    public void buildArrayTestShouldCreateCorrectArrayFromFile() {
        //given
        ArrayBuilderDirector director = new ArrayBuilderDirector(new FileArrayBuilder("src/test/resources/FileArrayBuilderInputTest"));
        int[] arr = new int[]{50, 56, 3, 89, -84, 37, 59, 55, -6, -21, 13, 38, 45, 64, 67, -36, 42};
        Array expected = new Array(arr);
        //when
        Array actual = director.buildArray();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildArrayTestShouldCreateZeroLengthArrayFromEmptyFile() {
        //given
        ArrayBuilderDirector director = new ArrayBuilderDirector(new FileArrayBuilder("src/test/resources/FileArrayBuilderInputTestEmpty"));
        Array expected = new Array(0);
        //when
        Array actual = director.buildArray();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void buildArrayTestShouldThrowRuntimeExceptionWhenFileLost() {
        //given
        ArrayBuilderDirector director = new ArrayBuilderDirector(new FileArrayBuilder("src/test/resources/FileArrayBuilderInputTestLost"));
        //when
        director.buildArray();
    }

    @Test
    public void buildArrayTestShouldReturnNotNull() {
        //given
        ArrayBuilderDirector director = new ArrayBuilderDirector(new RandomArrayBuilder());
        //when
        Array actual = director.buildArray();
        //then
        Assert.assertNotNull(actual);
    }
}
