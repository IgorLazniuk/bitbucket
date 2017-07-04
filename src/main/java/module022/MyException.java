package module022;

/**Create custom exceptions and throw in case of errors.
 */

public class MyException extends Exception {
    @Override
    public String getMessage() {
        return "Element is not Integer";
    }


}

/**
 * Constructs a new exception with "MyQueue is overlimit" message.
 */

