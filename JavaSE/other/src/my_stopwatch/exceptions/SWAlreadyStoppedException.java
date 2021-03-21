package my_stopwatch.exceptions;

public class SWAlreadyStoppedException extends SWException{
    public SWAlreadyStoppedException(String message, String currentTime) {
        super(message, currentTime);
    }
}
