import java.util.*;
public class VectorDemo{
    public static void main(String[] args){
        Vector<Integer>vec=new Vector<>();
        System.out.println(vec.capacity());
        vec.add(34);
        System.out.println(vec.size());
        vec.add(1);
        vec.add(3);
        vec.add(4);
        vec.add(9);
        for(Integer v:vec){
            System.out.println(v+" ");
        }
        System.out.println(vec.get(3));
        
    }
}