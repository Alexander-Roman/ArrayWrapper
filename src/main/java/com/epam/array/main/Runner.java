/*
 * Создание типа Array, который является классом оболочкой над массивом целого типа.
 * В данном типе должны быть реализованы конструкторы (позволяющие несколькими способами создавать объекты типа),
 * get-ы, set-ы и переопределенные методы класса Object (toString(), equals(), hasCode()).
 * Программа должна иметь следующие возможности:
 * 1. Сортировать массив пузырьком
 * 2. Осуществлять поиск элемента массива (использовать алгоритм бинарного поиска).
 * ...
 * 7. Заполнения элементов массива и с консоли, и с файла и с помощью генерации случайных чисел.
 */

package com.epam.array.main;

import com.epam.array.data.ArrayProvider;
import com.epam.array.data.ArrayProviderFactory;
import com.epam.array.data.InputType;
import com.epam.array.entity.Array;
import com.epam.array.exception.DataException;
import com.epam.array.logic.ArrayHandler;
import com.epam.array.logic.ArraySorter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    private final static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) throws DataException {

        //InputType inputType = InputType.valueOf(args[0]);
        InputType inputType = InputType.FILE;

        ArrayProvider provider = ArrayProviderFactory.create(inputType);
        Array array = provider.getArray();
        LOGGER.log(Level.DEBUG, "Initial array:\n" + array);


        ArraySorter sorter = new ArraySorter();
        array = sorter.sortBubble(array);
        LOGGER.log(Level.DEBUG, "Sorted array:\n" + array);


        //int search = Integer.parseInt(args[1]);
        int search = 42;

        ArrayHandler handler = new ArrayHandler();
        int index = handler.binarySearchIndexOf(array, search);
        LOGGER.log(Level.DEBUG, "Search result index of " + search + ": " + index);
    }
}
