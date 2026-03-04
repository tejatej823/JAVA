import java.util.*;
public class SetDemo{
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
    }
}