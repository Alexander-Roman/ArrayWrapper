package com.epam.array.builder;

public class ArrayBuilderDirectorFactory {

    public static ArrayBuilderDirector create(InputType inputType) {
        switch (inputType) {
            case CONSOLE:
                return new ArrayBuilderDirector(new ConsoleArrayBuilder());
            case FILE:
                return new ArrayBuilderDirector(new FileArrayBuilder());
            case RANDOM:
                return new ArrayBuilderDirector(new RandomArrayBuilder());
            default:
                throw new RuntimeException(inputType + "is unknown InputType!");
        }
    }
}
