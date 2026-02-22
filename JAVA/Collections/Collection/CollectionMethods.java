import java.util.*;
public class CollectionMethods{
    public static void main(String[] args){
        List<Integer>list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);//add elemets to list
        System.out.print("List after adding numbers : "+list1);
        list1.remove(6);//removing elements of specific index
        list1.remove(Integer.valueOf(60));//removing specific element
        System.out.print("List after removing numbers : "+list1);
        List<Integer>list2=new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(80);
        list2.add(90);
        list2.add(100);
        System.out.println("List2 elements : "+list2);
        // list1.removeAll(list2);//A-B
        System.out.println("List1 after removeAllmethod : "+list1);
        list2.retainAll(list1);//A intersection B
        System.out.println("List2 after retainAllmethod : "+list2);
        Object[] arr=list1.toArray();
        for(Object e:arr){
            System.out.print(e.getClass());

        }

    }
}