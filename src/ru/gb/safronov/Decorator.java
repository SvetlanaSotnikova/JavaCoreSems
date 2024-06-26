package ru.gb.safronov;

/**
 * The Decorator class provides a static method to decorate an integer.
 */
public class Decorator {

    /**
     * Constructs a new Decorator instance.
     */

    /**
     * Decorates an integer by formatting it into a string.
     *
     * @param a The integer to decorate.
     * @return A decorated string representing the input number.
     */
    public static String decorate(int a) {
        return String.format("Here is your number: %d.", a);
    }
}
