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
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
