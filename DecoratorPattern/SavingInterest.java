package Labs.DecoratorPattern;

public class SavingInterest implements Interest{
    @Override
    public double calculateInterest(double balance) {
        if (balance>5000) {
            return balance * 0.04;
        }else if (balance > 1000 && balance <5000 ){
            return  balance * 0.02;
        } else if( balance <1000){
            return  balance * 0.01;
        }
        return 0;
    }
}
