package JavaPractiseSet.Exceptions;

public class Main {
    public static void main(String[] args) {
        BankAccount account=new BankAccount(500);
        try {
            account.withdraw(600);
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction complete");
        }
    }
}
