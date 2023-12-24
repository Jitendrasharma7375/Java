import java.util.*;
import java.lang.String;
class Employee
{
    private String emp_name;
    private int emp_id;
    private double emp_salary;
    public Employee()
    {

    }
    public Employee(int emp_id,String emp_name,double emp_salary)
    {
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.emp_salary=emp_salary;
        
    } 
    public void display()
    {
        System.out.println("Id: "+emp_id);
        System.out.println("Name: "+emp_name);
        System.out.println("Salary: "+emp_salary);
    }
    public int binarySearch(Employee arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee id to search:");
        int item=sc.nextInt();
        int flag=0;
        int lb=0;
        int ub=3;
        int count=0;
        while(lb<=ub)
        {
            int mid=(lb+ub)/2;
            count++;
            if(item==arr[mid].emp_id)
            {
                System.out.println("Employee found at position "+mid);
                System.out.println("Employee details:");
                flag++;
                arr[mid].display();
                return count;
                //break;
            }
            else {
                if(item>arr[mid].emp_id)
                    lb=mid+1;
                else 
                    ub=mid-1;
            }
        }
        if(flag==0)
        {
            System.out.println("Sorry Employee not found.");
        }
        sc.close();
        return count;
    }
}
   
public class BinarySearchName {
    public static void main(String[] args) {
    Employee obj[]=new Employee[4];
    obj[0]=new Employee(1,"jitendra",50000);
    obj[1]=new Employee(2,"hitesh",40000);
    obj[2]=new Employee(3,"mohit",30000);
    obj[3]=new Employee(4,"jay",20000);
    Employee e=new Employee();
    int count=e.binarySearch(obj);
    System.out.println("Comparison: "+count);
    }
}
