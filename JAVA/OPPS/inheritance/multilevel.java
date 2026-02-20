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
public class multilevel extends B{
    public static void main(String[] args){
        multilevel obj1=new multilevel();
        obj1.printA();
    }
}