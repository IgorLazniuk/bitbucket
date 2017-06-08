package module031;

/**
 * Constructs a new exception with "MyQueue is overlimit" message.
 */
public class MyException extends Exception {
    @Override
    public String getMessage() {
        return "MyQueue is overlimit";
    }


}
