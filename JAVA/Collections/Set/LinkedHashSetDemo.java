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
        
    }
}