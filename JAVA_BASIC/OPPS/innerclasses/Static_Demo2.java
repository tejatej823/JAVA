class Student{
    public String name;
    public int roll_no;
    public String email;
    public String address;
    public Student(Builder builder){
        this.name=builder.name;
        this.roll_no=builder.roll_no;
        this.email=builder.email;
        this.address=builder.address;
    }
    public static class Builder{
        private String name;
        private int roll_no;
        private String email;
        private String address;
        
        public Builder set_name(String name){
            this.name=name;
            return this;
        }
        public Builder set_roll_no(int roll_no){
            this.roll_no=roll_no;
            return this;
        }
        public Builder set_email(String email){
            this.email=email;
            return this;
        }
        public Builder set_address(String address){
            this.address=address;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}
public class Static_Demo2{
    public static void main(String[] args){
        Student s1=new Student.Builder().set_name("Teja").set_roll_no(11).set_email("teja@gmail.com").set_address("India").build();
        System.out.println(s1.email);
    }
}