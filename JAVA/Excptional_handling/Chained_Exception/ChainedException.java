class CustomException extends Exception{
    public CustomException(String s,Exception e){
        super(s,e);
    }
}
public class ChainedException{
    static void methodB(){
        int a=10/0;
    }
    static void methodA() throws CustomException{
        try{
            methodB();
        }
        catch(Exception e){
            throw new CustomException("Custom message",e);
        }
    }
    public static void main(String[] args){

        try{
            methodA();
        }
        catch(CustomException e){
            System.out.println("Message : "+e.getMessage());
            System.out.println("Original cause : "+e.getCause());
        }
    }
}