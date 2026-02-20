import java.io.FileReader;
import java.io.IOException;

public class Try_with_resource{
    public static void main(String[] args){
        try(FileReader fr=new FileReader("text.txt")){
            char[] a=new char[16];
            fr.read(a);
            for(char c:a){
                System.out.println(c);
            }
        }
        catch(IOException e){
            System.out.println("Exception occured : "+e);
        }
    }
}