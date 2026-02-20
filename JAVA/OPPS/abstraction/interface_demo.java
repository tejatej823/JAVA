interface Shape{
    void area();
    void perimeter();
    double P_I=3.14;
}
class Rectangle implements Shape{
    double length;
    double width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public void area(){
        System.out.println("Area of rectangle : "+length*width);
    }
    public void perimeter(){
        System.out.print("Perimeter of rectangle : "+2*(length+width));
    }
}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println("Area of circle : "+Shape.P_I*radius*radius);
    }
    public void perimeter(){
        System.out.println("Perimeter of circle : "+2*P_I*radius);
    }
}
public class interface_demo{
    public static void main(String[] args){
        Shape rectangle=new Rectangle(23,23);
        rectangle.area();
        rectangle.perimeter();
        Shape circle=new Circle(100);
        circle.area();
        circle.perimeter();
    }
}
