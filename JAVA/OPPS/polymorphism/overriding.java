class Parent{
    void print(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
    void print(){
        System.out.println("Child Class");
    }
}
public class overriding{
    public static void main(String[] args){
        Parent a1=new Parent();
        Parent a2=new Child();
        a1.print();
        a2.print();
    }
}