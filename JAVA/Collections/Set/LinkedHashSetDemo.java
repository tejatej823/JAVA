import java.util.*;
public class LinkedHashSetDemo{
    public static void main(String[] args){
        LinkedHashSet<Integer>set1=new LinkedHashSet<>();
        set1.add(111);
        set1.add(222);
        set1.add(333);
        set1.add(444);
        System.out.println(set1);
        set1.remove(444);
        System.out.println(set1);
        LinkedHashSet<Integer>set2=new LinkedHashSet<>();
        set2=(LinkedHashSet)set1.clone();
        System.out.println(set2);
        set2.remove(333);
        System.out.println(set2);
        System.out.println(set2.toString());
        Integer[] arr=new Integer[2];
        arr=set2.toArray(arr);
        System.out.println(arr);
        for(Integer x:arr){
            System.out.println(x);
        }
        set2.clear();
        System.out.println(set2);
    }
}