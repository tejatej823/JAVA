class Address{
    public int door_no;
    public int pin_code;
    public String street_name;
    public String state_name;
    Address(int door_no,int pin_code,String  street_name,String state_name){
        this.door_no=door_no;
        this.pin_code=pin_code;
        this.street_name=street_name;
        this.state_name=state_name;
    }
}

class Student{
    public Address address;
    public String name;
    public int roll_no;
    Student(String name,int roll_no,Address address){
        this.name=name;
        this.roll_no=roll_no;
        this.address=address;
    }
}
public class aggregation{
    public static void main(String[] args){
        Address address1=new Address(12,215671,"Ram Nagar","Chennai");
        Student student1=new Student("Teja",21,address1);
        System.out.println("Name : "+student1.name);
        System.out.println("Roll no : "+student1.roll_no);
        System.out.println("State : "+student1.address.state_name);
    }
}
