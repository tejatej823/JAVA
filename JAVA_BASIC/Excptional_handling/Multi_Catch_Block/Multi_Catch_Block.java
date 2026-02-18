public class Multi_Catch_Block{

    public static void main(String[] args){
    try{
        int a=1/0;
        int[] b=new int[4];
        System.out.println(b[5]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBoundsException : "+e);
    }
    catch(ArithmeticException e){
        System.out.println("Exception thrown : "+e);
    }
    }
}