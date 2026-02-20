
package protected_modifier;
class Parent{
    protected int x=10;
}
public class sample1 extends sample2{
    public static void main(String[] args){
        sample1 obj1=new sample1();
        System.out.println("This is the protected value : "+obj1.a);
    }
}