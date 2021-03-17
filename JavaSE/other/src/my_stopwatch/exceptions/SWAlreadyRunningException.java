package my_stopwatch.exceptions;

public class SWAlreadyRunningException extends SWException{

    public SWAlreadyRunningException(String message, long currentTime) {
        super(message, currentTime);
    }
}
