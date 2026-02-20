import java.io.FileReader;
public class Propagation{
    static void method2() throws Exception{
        FileReader fr=new FileReader("file.txt");
    }
    static void method1() throws Exception{
        method2();
    }
    public static void main(String[] args) throws Exception{
        try{
        method1();
        }
        catch(Exception e){
            System.out.println("Exception is handled here");
        }
    }
}