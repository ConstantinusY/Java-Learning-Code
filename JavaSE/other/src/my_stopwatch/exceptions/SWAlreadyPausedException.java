package my_stopwatch.exceptions;

public class SWAlreadyPausedException extends SWException{

    public SWAlreadyPausedException(String message, String currentTime) {
        super(message, currentTime);
    }
}
