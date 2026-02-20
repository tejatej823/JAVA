class Outer{
    private int number=34;
    static class Inner{
        public static void print(){
            System.out.println("This is method of static class of Outer class");
        }
    }
}
public class Static_Demo{
    public static void main(String[] args){
     new Outer.Inner().print();
    }
}