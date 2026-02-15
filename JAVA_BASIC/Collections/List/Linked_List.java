import java.util.*;
public class Linked_List{
    public static void main(String[] args){
        List<Integer> list1=new LinkedList<>();
        list1.add(34);
        List<Integer>list2=new ArrayList<>(list1);
        list2.add(33);
        System.out.println(list2);
    }
}