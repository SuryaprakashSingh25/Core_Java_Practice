package JavaPractiseSet.CollectionProblems;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

    public static void main(String[] args) {
        String s="the quick brown fox jumps over the lazy dog the end";
        Map<String,Integer> ans=new HashMap<>();
        for(String it:s.split(" ")){
            ans.put(it,ans.getOrDefault(it,0)+1);
           //Alternate ans.merge(it,1,Integer::sum);
        }
        for(Map.Entry<String,Integer> it:ans.entrySet()){
            System.out.println(it.getKey()+" "+it.getValue());
        }
    }
}
