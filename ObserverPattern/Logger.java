package Labs.ObserverPattern;

public class Logger implements Observer{
    public void update(String message) {
        System.out.println("Logger: " + message);
    }
}


