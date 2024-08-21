package chain.of.responsibility.pattern;

public interface Handler {

    void setNextHandler(Handler handler);
    void process(Video video);
}
