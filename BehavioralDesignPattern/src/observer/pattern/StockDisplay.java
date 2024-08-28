package observer.pattern;

public class StockDisplay implements Observer {
    private String name;

    public StockDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(name + " received an update: Stock price is now $" + stockPrice);
    }
}
