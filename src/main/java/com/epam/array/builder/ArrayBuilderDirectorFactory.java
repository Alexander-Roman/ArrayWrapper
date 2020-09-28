package com.epam.array.builder;

public class ArrayBuilderDirectorFactory {

    private static final String FILE_NAME = "FileArrayBuilderInput";

    public static ArrayBuilderDirector create(InputType inputType) {
        switch (inputType) {
            case CONSOLE:
                return new ArrayBuilderDirector(new ConsoleArrayBuilder());
            case FILE:
                return new ArrayBuilderDirector(new FileArrayBuilder(FILE_NAME));
            case RANDOM:
                return new ArrayBuilderDirector(new RandomArrayBuilder());
            default:
                throw new RuntimeException(inputType + "is unknown InputType!");
        }
    }
}
