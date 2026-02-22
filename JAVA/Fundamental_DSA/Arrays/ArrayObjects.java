class Student{
    public int roll_no;
    public String name;
    Student(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
    }
}
public class ArrayObjects{
    public static void main(String[] args){
        Student[] arr;
        arr=new Student[5];
        arr[0]=new Student(1,"Teja");
        arr[1]=new Student(2,"Tejesh");
        arr[2]=new Student(3,"Anand");
        for(int i=0;i<3;i++){
            System.out.println("Element at "+i+" is "+arr[i].name);
        }
    }
}