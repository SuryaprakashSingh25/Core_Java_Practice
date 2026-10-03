package GPTPractiseSet.Map;

import java.util.HashMap;
import java.util.Map;

public class MapCompute {
    public static Map<String,Integer> countFrequency(String[] words){
        Map<String,Integer> ans=new HashMap<>();
        for(String word:words){
            ans.compute(word,(k,v)->(v==null)?1:v+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] words = {
                "java", "spring", "java",
                "kafka", "spring", "java"
        };
        Map<String,Integer> ans=countFrequency(words);
        for(Map.Entry<String,Integer> it:ans.entrySet()){
            System.out.println(it.getKey()+" -> "+it.getValue());
        }
    }
}
