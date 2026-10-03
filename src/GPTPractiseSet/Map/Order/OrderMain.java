package GPTPractiseSet.Map.Order;

import java.util.*;

public class OrderMain {
    public static Map<Integer,List<Order>> groupByCustomer(List<Order> orders){
        Map<Integer,List<Order>> ans=new HashMap<>();
        for(Order it:orders){
            ans.computeIfAbsent(it.getCustomerId(), k -> new ArrayList<>()).add(it);
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(101, 1),
                new Order(102, 2),
                new Order(103, 1),
                new Order(104, 3),
                new Order(105, 2),
                new Order(106, 1)
        );
        Map<Integer, List<Order>> ans = groupByCustomer(orders);
        for (Map.Entry<Integer, List<Order>> it : ans.entrySet()) {
            System.out.print(it.getKey() + " -> ");
            for(Order val:it.getValue()){
                System.out.print(val.getOrderId()+" ");
            }
            System.out.println();
        }
    }
}
