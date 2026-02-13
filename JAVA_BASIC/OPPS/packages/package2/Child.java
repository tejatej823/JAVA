package packages.package2;
import packages.package1.Parent;
public class Child{
    void print_parent_from_child(Parent p){
        p.print_parent();
    }
    public static void main(String[] args){
        Parent p=new Parent();
        Child c=new Child();
        c.print_parent_from_child(p);
    }
}