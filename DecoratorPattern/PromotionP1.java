package Labs.DecoratorPattern;

public class PromotionP1 extends InterestDecorator {
    public PromotionP1(Interest decoratedInterest) {
        super(decoratedInterest);
    }

    @Override
    public double calculateInterest(double balance) {
        double baseInterest = super.calculateInterest(balance);
        return baseInterest + (balance * 0.01);
    }

}
