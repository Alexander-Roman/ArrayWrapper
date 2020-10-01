package com.epam.array.data;

import com.epam.array.entity.Array;
import com.epam.array.exception.DataException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RandomArrayProviderTest {

    @Test
    public void getArrayTestShouldReturnNotNull() throws DataException {
        //given
        ArrayProvider provider = new RandomArrayProvider();
        //when
        Array actual = provider.getArray();
        //then
        Assert.assertNotNull(actual);
    }
}
