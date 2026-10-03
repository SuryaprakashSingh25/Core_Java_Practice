package GPTPractiseSet.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FreqMap {
    public static Map<String,Integer> countFrequency(String[] words){
        Map<String,Integer> mp=new HashMap<>();
        for(String it:words){
            mp.put(it,mp.getOrDefault(it,0)+1);
        }
        return mp;
    }
    public static void main(String[] args) {
        String[] words = {
                "java", "spring", "java", "kafka",
                "spring", "java", "docker"
        };
        Map<String,Integer> ans=countFrequency(words);
        for(Map.Entry<String,Integer> it:ans.entrySet()){
            System.out.println(it.getKey()+" -> "+it.getValue());
        }

        Map<String, Long> mp= Arrays.stream(words)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(mp);
    }
}
