package Mod1PA.Problem4;

public class InvalidTimeException extends Exception {

    public InvalidTimeException() {
        super("ERROR: Time entered not valid, Enter 1 through 6");
    }

    public InvalidTimeException(String message) {
        super(message);
    }
}
