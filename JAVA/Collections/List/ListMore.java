import java.util.*;
public class ListMore{
    public static void main(String[] args){
        List<String>fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Papaya");
        for(int i=0;i<fruits.size();i++){
            System.out.println("fruit is "+fruits.get(i));
        }
        for(String fruit:fruits){
            System.out.println("for each fruit "+fruit);
        }
        Iterator<String>f=fruits.iterator();
        while(f.hasNext()){
            System.out.println("iterator "+f.next());
        }
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(29);
        Iterator<Integer>it=list.iterator();
        it.next();
        it.remove();
        System.out.println(it.next());
        while(it.hasNext()){
            System.out.println(it.next());
        }
        List<Integer>list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        Iterator<Integer>it2=list2.iterator();
               while(it2.hasNext()){
            System.out.println(it2.next());
        }  
        
    }
}
