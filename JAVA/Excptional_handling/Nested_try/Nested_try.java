public class Nested_try{
    public static void main(String[] args){
        try{
                int[] b=new int[2];
                try{
                    int a=1/0;
                }
catch(Exception e){
                    System.out.println("Arithmetic Exception : "+e);
                }
                                System.out.println(b[3]);            

        }
        catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }
}