package my_stopwatch.exceptions;

public abstract class SWException extends RuntimeException{
    public SWException(String message, long currentTime) {
        super(message);
        this.currentTime = currentTime;
    }

    public long currentTime; //异常发生时计时器的时间
}
