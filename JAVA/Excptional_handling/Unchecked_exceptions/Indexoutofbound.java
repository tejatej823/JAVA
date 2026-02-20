public class Indexoutofbound{
    public static void main(String[] args){
        try{
        int a[]=new int[2];
        System.out.println(a[2]);
        }
        catch(Exception e){
            System.out.println("This is the exception : "+e);
        }
    }
}