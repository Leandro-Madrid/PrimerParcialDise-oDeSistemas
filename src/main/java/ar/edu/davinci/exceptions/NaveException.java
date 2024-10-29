package ar.edu.davinci.exceptions;

public abstract class NaveException extends RuntimeException {
    public NaveException(String message) {
        super(message);
    }
}
