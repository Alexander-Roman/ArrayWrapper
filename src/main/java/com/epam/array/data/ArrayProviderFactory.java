package com.epam.array.data;

public class ArrayProviderFactory {

    private static final String FILE_NAME = "data/FileArrayProviderInput";

    public static ArrayProvider create(InputType inputType) {
        switch (inputType) {
            case CONSOLE:
                return new ConsoleArrayProvider();
            case FILE:
                return new FileArrayProvider(FILE_NAME);
            case RANDOM:
                return new RandomArrayProvider();
            default:
                throw new RuntimeException(inputType + "is unknown InputType!");
        }
    }
}
