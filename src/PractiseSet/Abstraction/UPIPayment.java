package PractiseSet.Abstraction;

public class UPIPayment extends Payment{
    @Override
    public void pay(double amount){
        System.out.println("UPI Payment");
    }
}
