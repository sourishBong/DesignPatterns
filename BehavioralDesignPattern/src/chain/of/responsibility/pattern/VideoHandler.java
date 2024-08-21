package chain.of.responsibility.pattern;

public abstract class VideoHandler implements Handler{

    protected Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public abstract void process(Video video);
}
