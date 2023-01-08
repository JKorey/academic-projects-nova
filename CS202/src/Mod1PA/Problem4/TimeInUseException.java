package Mod1PA.Problem4;

public class TimeInUseException extends Exception {

    public TimeInUseException() {

        super("ERROR: Time you entered is in use!");

    }

    public TimeInUseException(String message) {
        super(message);
    }
}
