class Parent{
    public void print(){
        System.out.println("This is parent class");
    }
}
class Child extends Parent{
    public void print(){
        super.print();
        System.out.println("This is child class");
    }
}
public class polymorphism1{
    public static void main(String[] args){
        Parent obj=new Child();
        obj.print();
    }
}