package PractiseSet.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeat {
    public static char firstNonRepeating(String s){
        Map<Character,Integer> mp=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> it:mp.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String s="swiss";
        System.out.println(firstNonRepeating(s));
    }
}
