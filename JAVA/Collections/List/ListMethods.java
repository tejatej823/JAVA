import java.util.*;
public class ListMethods{
    public static void main(String[] args){
        List<Integer>list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(10);
        System.out.println(list1);
        System.out.println(list1.get(1));
        list1.set(4,55);
        System.out.println(list1);
        list1.add(2,25);
        System.out.println(list1);
        list1.remove(2);        
        System.out.println(list1);
        int a=list1.indexOf(Integer.valueOf(50));//give the index of first occurance of that value
        System.out.println("First occurance index : "+a);
        int b=list1.lastIndexOf(Integer.valueOf(10));
        System.out.println("Last occurance index : "+b);
        Object[] obj=list1.toArray();
        for(Object c:obj){
            System.out.println(c);
        }
        
    }
}