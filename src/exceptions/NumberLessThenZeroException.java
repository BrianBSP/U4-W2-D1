package exceptions;

public class NumberLessThenZeroException extends RuntimeException {

    public NumberLessThenZeroException(int num) {
        super("Il numero inserito: " + num + " è inferiore di zero!");
    }
}
