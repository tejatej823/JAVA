class Employee{
    private int employee_id;
    private String employee_name;
    private String employee_role;
    Employee(int employee_id,String employee_name,String employee_role){
        this.employee_id=employee_id;
        this.employee_name=employee_name;
        this.employee_role=employee_role;
    }
    public double generate_monthly_pay(){
        return 2.3;
    };
}
class Salary extends Employee{
    double yearly_pay;
    public Salary(int employee_id,String employee_name,String employee_role,double yearly_pay){
        super(employee_id,employee_name,employee_role);
        this.yearly_pay=yearly_pay;
    }
    public double generate_monthly_pay(){
        double monthly_pay=yearly_pay/12;
        return monthly_pay;
    }
}

public class abstraction{
    public static void main(String[] args){
        Employee e1=new Salary(123,"Teja","Support role",450000);
        double monthly_salary=e1.generate_monthly_pay();
        System.out.println("Monthly salary : "+monthly_salary);
    }
}