package JavaPractiseSet.CollectionProblems;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(5,3,5,1,3,9,1,7);
        Set<Integer> st = new LinkedHashSet<>(nums);
        List<Integer> ans=new ArrayList<>(st);
        for(int num:ans){
            System.out.print(num+" ");
        }
        //Alternate
//        List<Integer> res=nums.stream().distinct().toList();
//        for(int num:res){
//            System.out.print(num+" ");
//        }
    }
}
