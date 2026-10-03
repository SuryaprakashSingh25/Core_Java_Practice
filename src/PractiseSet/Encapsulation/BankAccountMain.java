package PractiseSet.Encapsulation;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("1","Rohit",450000);
        bankAccount.deposit(100000);
        bankAccount.withdraw(2500);
        System.out.println(bankAccount.getBalance());
    }
}
