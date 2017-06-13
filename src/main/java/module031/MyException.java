package module031;

/**Create custom exceptions and throw in case of errors.
 */

public class MyException extends Exception {
    @Override
    public String getMessage() {
        return "My Queue is overlimit";
    }


}

/**
 * Constructs a new exception with "MyQueue is overlimit" message.
 */

