public class Employee{
    public String name;
    public double salary;
    public static int count=0;
    public Employee(String EmployeeName){
        name=EmployeeName;
    }
    public void SetSalary(double Salary){
        salary=Salary;
    }
    public void counter(){
          count=count+1;
          System.out.println("counter :"+count);
    
    }
    
    public void printEmployee(){
        System.out.println("Employee name :"+name);
        System.out.println("Salary :"+salary);
    }
    public static void main(String[] args){
        Employee Emp1=new Employee("Teja");
        Emp1.SetSalary(100000);
        Emp1.printEmployee();
        Emp1.counter();
                Employee Emp2=new Employee("Tejesh");
        Emp2.SetSalary(200000);
        Emp2.printEmployee();
        Emp2.counter();

    }
}