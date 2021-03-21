package my_stopwatch.exceptions;

public abstract class SWException extends RuntimeException{
    public SWException(String message, String currentTime) {
        super(message);

        this.currentTime = currentTime;
    }

    public String currentTime; //异常发生时计时器的时间

    @Override
    public String toString() {
        return super.toString()+"\n异常发出者最后记录的时间："+currentTime;
    }
}
