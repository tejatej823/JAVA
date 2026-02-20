class A{
    public void printA(){
        System.out.println("Print A");
    }
}
class B extends A{
    public void printB(){
        System.out.println("Print B");
    }
}
public class hierarchial extends A{
    public static void main(String[] args){
        hierarchial obj1=new hierarchial();
        obj1.printA();
    }
}
