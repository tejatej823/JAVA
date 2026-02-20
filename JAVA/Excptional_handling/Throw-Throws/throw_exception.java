import java.io.FileReader;
public class throw_exception{
    static void test_method() throws Exception{
        FileReader fr=new FileReader("file.txt");
    }
    public static void main(String[] args) throws Exception{
        try{
        test_method();}
        catch(Exception e){
            System.out.println("Exception is handled here");
        }
        System.out.println("Program continues...");
    }
}