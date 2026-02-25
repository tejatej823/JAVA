import java.util.*;
public class ArrayListDemo{
    public static void main(String[] args){
        List<Integer>list1=new ArrayList<>();
        list1.add(12);
        list1.add(23);
        list1.add(34);
        list1.add(45);
        System.out.println(list1); 
        list1.add(0,99);
        System.out.println(list1); 
        System.out.println(list1.get(0));
        list1.set(0,22);
        System.out.println(list1);
        list1.remove(3);
        System.out.println(list1);
        System.out.println(list1.remove(Integer.valueOf(2)));
        System.out.println(list1.size());
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        for(Integer i:list1){
            System.out.print(i+" ");
        }
        Iterator<Integer>it=list1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(int i=0;i<8;i++){
            list1.add(i);
        }
        System.out.println(list1.size());
        list1.add(null);
        System.out.println(list1.get(12));
        List<Integer>list2=new ArrayList<>();
        list2.add(999);
        list2.addAll(1,list1);
        System.out.println(list2);
        System.out.println(list2.indexOf(23));
        list2.add(45);
        System.out.println(list2.lastIndexOf(45));
        System.out.println(list2.subList(2,6));
        
    }
}