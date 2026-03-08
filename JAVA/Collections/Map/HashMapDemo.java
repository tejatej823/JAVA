import java.util.*;
public class HashMapDemo{
    public static void main(String[] args){
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"Teja");
        map.put(2,"Tejesh");
        map.put(3,"Rajesh");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.remove(3));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Tejesh"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        Set<Integer>keys=map.keySet();
        for(Integer k:keys){
            System.out.println(k);
        }
        Collection<String>list=map.values();
        for(String s:list){
            System.out.println(s);
        }
        for(Map.Entry<Integer,String>e:map.entrySet()){
            System.out.println(e);
        }
        map.forEach((k,v)->System.out.println(k+" "+v));
        map.replace(1,"Teja","KOHLI");
        System.out.println(map);
        
    }
}