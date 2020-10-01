package com.epam.array.data;

import com.epam.array.entity.Array;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ConsoleArrayProvider implements ArrayProvider {

    private final static Logger LOGGER = LogManager.getLogger();

    @Override
    public Array getArray() {
        Array array = createArray();
        fillArray(array);
        return array;
    }

    private Array createArray() {
        @SuppressWarnings("resources")
        Scanner scanner = new Scanner(System.in);
        LOGGER.log(Level.INFO, "Enter the length of the array:");
        int length = scanner.nextInt();
        LOGGER.log(Level.INFO, "Value received: " + length);
        return new Array(length);
    }

    private void fillArray(Array array) {
        @SuppressWarnings("resources")
        Scanner scanner = new Scanner(System.in);
        LOGGER.log(Level.INFO, "Enter integer values of array elements:");
        for (int i = 0; i < array.size(); i++) {
            array.set(i, scanner.nextInt());
            LOGGER.log(Level.INFO, "Value received: " + array.get(i));
        }
        LOGGER.log(Level.INFO, "Input completed!");
    }
}
