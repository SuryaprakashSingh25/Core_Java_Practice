package JavaPractiseSet.Generic;

import java.util.ArrayList;
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
        //Integer i=b.getVal();  //ClassCastException here and not at setValue

        List<Integer> list= Arrays.asList(1,4,2,9,7,3);
        System.out.println(max(list));
        System.out.println(max(Arrays.asList("pear", "apple", "zebra")));
        System.out.println(sum(Arrays.asList(1,2,4,3,5)));
        System.out.println(sum(Arrays.asList(1.2,4,5.7,8.1)));
        //System.out.println(sum(Arrays.asList("Hello", "World")));

        List<Integer> ints=new ArrayList<>();
        List<Number> nums=new ArrayList<>();
        List<Object> objs=new ArrayList<>();

        addNumbers(ints);
        addNumbers(nums);
        addNumbers(objs);
        System.out.println(ints);
        System.out.println(nums);
        System.out.println(objs);
    }

    static double sum(List<? extends Number> list){
        //list.add(5);
        double ans=0;
        for(Number it:list){
            ans+=it.doubleValue();
        }
        return ans;
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

    static void addNumbers(List<? super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);

        //Integer i=list.get(0);
        Object o=list.get(0);
        System.out.println("First element read as Object: "+o);
    }
}
