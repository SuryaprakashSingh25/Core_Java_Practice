package GPTPractiseSet.Encapsulation;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount<0){
            System.out.println("Amount should be greater than 0!");
            return;
        }
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount<0){
            System.out.println("Amount should be greater than 0!");
            return;
        }
        if(amount>balance){
            System.out.println("Insufficient Balance");
            return;
        }
        balance-=amount;
    }

    public double getBalance(){
        return balance;
    }
}
