class Add{
    void add(int a,int b){
        int c=a+b;
        System.out.println("Result : "+c);
    }
    void add(double a,double b){
        double c=a+b;
        System.out.println("Result : "+c);
    }
}

public class polymorphism2{
    public static void main(String[] args){
        Add add_numbers=new Add();
        add_numbers.add(2,2);
        add_numbers.add(2.3,4.4);
    }
}