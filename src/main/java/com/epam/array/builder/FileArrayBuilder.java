package com.epam.array.builder;

import com.epam.array.entity.Array;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileArrayBuilder extends ArrayBuilder {

    private final String FILE_NAME;

    public FileArrayBuilder(String FILE_NAME) {
        this.FILE_NAME = FILE_NAME;
    }

    @Override
    public void createArray() {
        int amount = 0;

        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(FILE_NAME)))) {
            while (scanner.hasNextInt()) {
                scanner.nextInt();
                amount++;
            }
        } catch (IOException e) {
            throw new RuntimeException("File reading error");
        }

        array = new Array(amount);
    }

    @Override
    public void buildValues() {
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(FILE_NAME)))) {
            for (int i = 0; i < array.size(); i++) {
                array.set(i, scanner.nextInt());
            }
        } catch (IOException e) {
            throw new RuntimeException("File reading error");
        }
    }
}
