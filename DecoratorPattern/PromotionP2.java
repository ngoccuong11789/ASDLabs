package Labs.DecoratorPattern;

public class PromotionP2 extends InterestDecorator{
    public PromotionP2(Interest decoratedInterest) {
        super(decoratedInterest);
    }

    @Override
    public double calculateInterest(double balance) {
        double baseInterest = super.calculateInterest(balance);
        return baseInterest + (baseInterest * 0.02);
    }
}
