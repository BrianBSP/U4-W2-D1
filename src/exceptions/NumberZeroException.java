package exceptions;

public class NumberZeroException extends Exception {
    public NumberZeroException() {
        super("Nessun numero può essere diviso per Zero!");
    }
}
