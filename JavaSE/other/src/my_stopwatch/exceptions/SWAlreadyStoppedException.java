package my_stopwatch.exceptions;

public class SWAlreadyStoppedException extends SWException{
    public SWAlreadyStoppedException(String message, long currentTime) {
        super(message, currentTime);
    }
}
