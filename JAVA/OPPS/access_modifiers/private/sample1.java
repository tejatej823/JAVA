class sample2{
    private int y=9;
    public void y_value(){
        System.out.println("The value of y : "+y);
    }
}

public class sample1{
    private int x=10;
    public static void main(String[] args){
        sample2 obj2=new sample2();
        sample1 obj1=new sample1();
        System.out.println("The private value is : "+obj1.x);
        obj2.y_value();
    }
}