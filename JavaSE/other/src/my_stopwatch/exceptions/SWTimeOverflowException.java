package my_stopwatch.exceptions;

public class SWTimeOverflowException extends SWException{
    public SWTimeOverflowException(String message, long currentTime) {
        super(message, currentTime);
    }
}
