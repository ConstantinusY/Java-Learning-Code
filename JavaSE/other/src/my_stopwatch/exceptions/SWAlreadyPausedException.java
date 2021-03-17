package my_stopwatch.exceptions;

public class SWAlreadyPausedException extends SWException{

    public SWAlreadyPausedException(String message, long currentTime) {
        super(message, currentTime);
    }
}
