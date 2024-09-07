package Labs.DecoratorPattern;

public class PromotionP3 extends InterestDecorator{
    public PromotionP3(Interest decoratedInterest) {
        super(decoratedInterest);
    }

    @Override
    public double calculateInterest(double balance) {
        double baseInterest = super.calculateInterest(balance);
        return baseInterest + (balance * 0.03);
    }

}
