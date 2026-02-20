class Test{
    static int a;
    {a=10;}
    Test(){
        a=a+10;
    }
}
public class initializer_block{
    public static void main(String[] args){
        Test obj=new Test();
        System.out.println(obj.a);
    }
}