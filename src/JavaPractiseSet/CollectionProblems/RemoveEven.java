package JavaPractiseSet.CollectionProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveEven {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        //Alternate
//        Iterator<Integer> it= nums.iterator();
//        while(it.hasNext()){
//            if(it.next()%2==0){
//                it.remove();
//            }
//        }
        nums.removeIf(num -> num%2==0);
        System.out.println(nums);
    }
}
