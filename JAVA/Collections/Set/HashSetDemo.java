import java.util.*;
public class HashmSetDemo{
    public static void main(String[] args){
        Set<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        set.remove(3);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);
        Set<Integer>set2=new HashSet<>();
        set2.add(11);
        set2.add(22);
        set2.add(33);
        set2.add(44);
        set2.add(55);
        set.addAll(set2);
        System.out.println(set);
        System.out.println(set2.contains(22));
    }
}