package Labs.DecoratorPattern;

public class CheckingInterest implements Interest{
    @Override
    public double calculateInterest(double balance) {
      if (balance > 1000 ){
            return  balance * 0.025;
        } else if( balance <1000){
            return  balance * 0.015;
        }
        return 0;
    }
}
