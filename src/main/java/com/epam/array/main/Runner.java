package com.epam.array.main;

import com.epam.array.builder.ArrayBuilderDirector;
import com.epam.array.builder.ArrayBuilderDirectorFactory;
import com.epam.array.builder.InputType;
import com.epam.array.entity.Array;
import com.epam.array.logic.ArrayHandler;
import com.epam.array.logic.ArraySorter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    private final static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        //InputType inputType = InputType.valueOf(args[0]);
        InputType inputType = InputType.FILE;

        ArrayBuilderDirector director = ArrayBuilderDirectorFactory.create(inputType);
        Array array = director.buildArray();
        logger.log(Level.DEBUG, "Initial array:\n" + array);


        ArraySorter sorter = new ArraySorter();
        array = sorter.sortBubble(array);
        logger.log(Level.DEBUG, "Sorted array:\n" + array);


        //int search = Integer.parseInt(args[1]);
        int search = 42;

        ArrayHandler handler = new ArrayHandler();
        int index = handler.binarySearchIndexOf(array, 42);
        logger.log(Level.DEBUG, "Search result index: " + index);
    }
}
