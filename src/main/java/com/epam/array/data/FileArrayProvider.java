package com.epam.array.data;

import com.epam.array.entity.Array;
import com.epam.array.exception.DataException;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileArrayProvider implements ArrayProvider {

    private final String FILE_NAME;

    public FileArrayProvider(String FILE_NAME) {
        this.FILE_NAME = FILE_NAME;
    }

    @Override
    public Array getArray() throws DataException {
        Array array = createArray();
        fillArray(array);
        return array;
    }

    private Array createArray() throws DataException {
        int amount = 0;

        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(FILE_NAME)))) {
            while (scanner.hasNextInt()) {
                scanner.nextInt();
                amount++;
            }
        } catch (IOException e) {
            throw new DataException("File reading error", e);
        }

        return new Array(amount);
    }

    private void fillArray(Array array) throws DataException {
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(FILE_NAME)))) {
            for (int i = 0; i < array.size(); i++) {
                array.set(i, scanner.nextInt());
            }
        } catch (IOException e) {
            throw new DataException("File reading error", e);
        }
    }
}
