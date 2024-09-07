package Labs.ObserverPattern;

public class SMSSender implements Observer {
    public void update(String message) {
        System.out.println("SMSSender: " + message);
    }
}
