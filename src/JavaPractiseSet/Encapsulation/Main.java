package JavaPractiseSet.Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account =
                new BankAccount(101, "Surya", 10000);

        account.deposit(2000);
        account.withdraw(3000);

        System.out.println(account.getBalance());
    }
}
