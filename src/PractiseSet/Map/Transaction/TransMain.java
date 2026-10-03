package PractiseSet.Map.Transaction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransMain {
    public static Map<Integer,Double> getTotalAmountByCustomer(List<Transaction> transactions){
        Map<Integer,Double> ans=new HashMap<>();
        for(Transaction it:transactions){
            int id=it.getCustomerId();
            double amount=it.getAmount();
            ans.merge(id,amount, Double::sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 101, 500.0),
                new Transaction(2, 102, 300.0),
                new Transaction(3, 101, 200.0),
                new Transaction(4, 103, 1000.0),
                new Transaction(5, 102, 700.0),
                new Transaction(6, 101, 300.0)
        );
        Map<Integer,Double>ans=getTotalAmountByCustomer(transactions);
        for(Map.Entry<Integer,Double> it:ans.entrySet()){
            System.out.println(it.getKey()+" -> "+it.getValue());
        }
    }
}
