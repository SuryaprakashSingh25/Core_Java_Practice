package GPTPractiseSet.Abstraction;

public class NetBankingPayment extends Payment{
    @Override
    public void pay(double amount){
        System.out.println("Net Banking Payment");
    }
}
