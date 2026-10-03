package JavaPractiseSet.Encapsulation;

public class BankAccount {
    private final int accountNumber;
    private final String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance){
        if(balance<0){
            throw new IllegalStateException("Initial balance cannot be negative");
        }
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if(amount>balance){
            throw new IllegalArgumentException("Insufficient Balance");
        }
        balance-=amount;
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }
}
