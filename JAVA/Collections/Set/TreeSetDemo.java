import java.util.*;
public class TreeSetDemo{
    public static void main(String[] args){
        TreeSet<Integer>set=new TreeSet<>();
        set.add(20);
        set.add(10);
        set.add(23);
        set.add(44);
        set.add(22);
        System.out.println(set);
        set.remove(22);
        System.out.println(set);
        System.out.println(set.contains(23));
        System.out.println(set.size());
        set.add(33);
        set.add(45);
        set.add(86);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.higher(10));
        System.out.println(set.lower(45));
        System.out.println(set.ceiling(20));
        System.out.println(set.floor(19));
        System.out.println(set.ceiling(19));
    }
}