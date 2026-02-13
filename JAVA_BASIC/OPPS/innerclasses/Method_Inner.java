class Outer{
    void my_method(){
        int number=23;
        class Inner{
            void print(){
                System.out.println("The number is : "+number);
            }
        }
        Inner in=new Inner();
        in.print();
    }
}
public class Method_Inner{
    public static void main(String[] args){
        Outer out=new Outer();
        out.my_method();
    }
}