import java.util.*;

class Emp 
{
	private
	String name, address;
	int year_joining, salary;
	
	public
	void accept() 
	{
		System.out.println("Enter the name of Employee = ");
		Scanner obj=new Scanner(System.in);
		name=obj.next();
		System.out.println("Enter the year of joining = ");
		year_joining=obj.nextInt();
		System.out.println("Enter the salary of the employee = ");
		salary=obj.nextInt();
		System.out.println("Enter the address of employee = ");
		address=obj.next();
	}
	void display()
	{
		System.out.println(name+ "\t" +year_joining+ "\t\t" +salary+ "\t" +address+ "\t");
	}	
}
public class Employee
{
	public static void main(String[] args)
	{
		Emp e[]=new Emp[3];
		int i;
		for(i=0;i<3;i++)
		{
			e[i]=new Emp();
		}
		for(i=0;i<3;i++)
		{
			e[i].accept();
		}
		System.out.println("name\tyear of joining\tsalary\taddress");
		for(i=0;i<3;i++)
		{
			e[i].display();
		}
	}
}
