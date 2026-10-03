package PractiseSet.Abstraction;

public class PayMain {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new NetBankingPayment();

        p1.pay(500);
        p2.pay(1000);
        p3.pay(2000);
    }
}
