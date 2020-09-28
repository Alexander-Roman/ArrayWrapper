package com.epam.array.builder;

import com.epam.array.entity.Array;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ConsoleArrayBuilder extends ArrayBuilder {

    private final static Logger logger = LogManager.getLogger();

    @Override
    public void createArray() {
        @SuppressWarnings("resources")
        Scanner scanner = new Scanner(System.in);
        logger.log(Level.INFO, "Enter the length of the array:");
        int length = scanner.nextInt();
        logger.log(Level.INFO, "Value received: " + length);
        array = new Array(length);
    }

    @Override
    public void buildValues() {
        @SuppressWarnings("resources")
        Scanner scanner = new Scanner(System.in);
        logger.log(Level.INFO, "Enter integer values of array elements:");
        for (int i = 0; i < array.size(); i++) {
            array.set(i, scanner.nextInt());
            logger.log(Level.INFO, "Value received: " + array.get(i));
        }
        logger.log(Level.INFO, "Input completed!");
    }
}
