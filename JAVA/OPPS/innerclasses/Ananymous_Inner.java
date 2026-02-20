interface Animal{
    void eat();
}
public class Ananymous_Inner{
    public static void main(String[] args){
        Animal animal=new Animal(){
            @Override
            public void eat(){
                System.out.println("The animal can eat");
            }
        };
        animal.eat();
    }
}