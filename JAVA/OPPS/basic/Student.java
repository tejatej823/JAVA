public class Student{
    String name;
    int roll_number;
    Student(String name,int roll_number){
        this.name=name;
        this.roll_number=roll_number;
    }
    private void print_student_info(){
        System.out.println("Student name : "+name);
        System.out.println("Roll number: "+roll_number);
    }
    public static void main(String[] args){
        Student student1=new Student("Teja",21);
        student1.print_student_info();
        Student student2=new Student("Tejesh",22);
        student2.print_student_info();
    }
}