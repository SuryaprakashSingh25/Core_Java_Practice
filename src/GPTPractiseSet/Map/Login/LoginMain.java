package GPTPractiseSet.Map.Login;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginMain {
    public static Map<Integer,Integer> getLoginCount(List<LoginEvent> events){
        Map<Integer,Integer> ans=new HashMap<>();
        for(LoginEvent it: events){
            ans.compute(it.getUserId(),(key,val) -> val==null?1:val+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        List<LoginEvent> events = Arrays.asList(
                new LoginEvent(101, "Surya"),
                new LoginEvent(102, "Rohit"),
                new LoginEvent(101, "Surya"),
                new LoginEvent(103, "Bumrah"),
                new LoginEvent(101, "Surya"),
                new LoginEvent(102, "Rohit")
        );
        Map<Integer,Integer> ans=getLoginCount(events);
        for(Map.Entry<Integer,Integer> it:ans.entrySet()){
            System.out.println(it.getKey()+" -> "+it.getValue());
        }
    }
}
