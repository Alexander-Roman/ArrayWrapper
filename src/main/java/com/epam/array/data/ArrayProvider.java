package com.epam.array.data;

import com.epam.array.entity.Array;
import com.epam.array.exception.DataException;

public interface ArrayProvider {

    Array getArray() throws DataException;
}
