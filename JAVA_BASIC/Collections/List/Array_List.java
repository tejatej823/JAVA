import java.util.*;

public class Array_List{
    public static void main(String[] args){
        List<Integer>list1=new ArrayList<Integer>();
        List<Integer>list2=new ArrayList<Integer>();
        list1.add(0,20);
        list1.add(1,30);
        System.out.println("list1 : "+list1);
        list2.add(10);
        list2.add(23);
        list2.add(55);
        System.out.println("list2 : "+list2);
        list1.addAll(1,list2);
        System.out.println("list1 : "+list1);
        list1.remove(1);
        System.out.println("list1 : "+list1);
        list1.set(2,11);
        System.out.println("list1 : "+list1);
        list1.add(0,99);
        System.out.println("list1 : "+list1);
        list1=new LinkedList<Integer>(list2);
        list1.add(0,88);
        System.out.println("list1 : "+list1);
    }
}