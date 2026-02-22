class MyException extends Exception{
    public MyException(String s,Throwable e){
        super(s,e);
    }
}
public class Custom_exception{
    public static void main(String[] args){
        try{

            try{
                            int a=0;
            int c=5/a;
                         System.out.println("c: "+c);
        
            }
            catch(Exception e){
                throw new MyException("Age less than 23",e);
            }
        }
        catch(MyException e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
           
        }
    }
}