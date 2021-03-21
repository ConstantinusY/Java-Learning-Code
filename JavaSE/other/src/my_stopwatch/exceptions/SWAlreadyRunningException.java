package my_stopwatch.exceptions;

public class SWAlreadyRunningException extends SWException{

    public SWAlreadyRunningException(String message, String currentTime) {
        super(message, currentTime);
    }
}
