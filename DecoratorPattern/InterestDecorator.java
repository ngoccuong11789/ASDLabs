package Labs.DecoratorPattern;

public abstract class InterestDecorator implements Interest {
    protected Interest decoratedInterest;

    public InterestDecorator(Interest decoratedInterest) {
        this.decoratedInterest  = decoratedInterest;
    }

    @Override
    public double calculateInterest(double balance) {
        return decoratedInterest.calculateInterest(balance);
    }

}
