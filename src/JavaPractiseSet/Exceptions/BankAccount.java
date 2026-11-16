package JavaPractiseSet.Exceptions;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount<0){
            throw new IllegalArgumentException("Amount cannot be less than 0");
        }
        if(amount>balance){
            throw new InsufficientFundsException("Amount is more than the balance");
        }
        balance-=amount;
    }


}
