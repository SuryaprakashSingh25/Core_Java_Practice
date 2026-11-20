package JavaPractiseSet.Generic;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> p1=new Pair<>("Rohit",45);
        Pair<Integer, String> p2=new Pair<>(25,"Surya");
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Box<Integer> box=new Box<>();
        box.setVal(10);
        //box.setVal("10");

        Box raw=new Box();
        raw.setVal("hello");
        Box<Integer> b=raw;
        Integer i=b.getVal();  //ClassCastException here and not at setValue

        List<Integer> list= Arrays.asList(1,4,2,9,7,3);
        System.out.println(max(list));
        System.out.println(max(Arrays.asList("pear", "apple", "zebra")));
    }

    static  <T extends Comparable<T>> T max(List<T> list){
        if(list==null || list.isEmpty()){
            throw new IllegalArgumentException("List is empty!");
        }
        T maxi=list.getFirst();
        for(T l:list){
            if(l.compareTo(maxi)>0){
                maxi=l;
            }
        }
        return maxi;
    }
}
