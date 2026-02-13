class class1{
    public void print(){
        System.out.println("This is super class");
    }
}

public class Single extends class1{
    public static void main(String[] args){
        Single obj1=new Single();
        obj1.print();
    }
}