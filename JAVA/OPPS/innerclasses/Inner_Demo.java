class Outer{
    private int number=333;
    class Inner{
        public void print(){
            System.out.print("This is method of inner class : "+number);
        }
    }
}
public class Inner_Demo{
    public static void main(String[] args){
        Outer out=new Outer();
        Outer.Inner in=out.new Inner();
        in.print();
    }
}