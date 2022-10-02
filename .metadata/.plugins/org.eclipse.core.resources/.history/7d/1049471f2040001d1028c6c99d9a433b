package Inheritence;

class Person1
{
	protected
	int Emp_id;
	String Emp_name;
	
	public
	Person1(int i, String n)
	{
		Emp_id=i;
		Emp_name=n;			
	}
}
public class Emp extends Person1
{
	private
	String Emp_city;
	double Emp_salary;
	
	public
	Emp(int i, String n,String c,double s)
	{
		super(i,n);
		Emp_city=c;
		Emp_salary=s;
	}	
	void show()
	{
		System.out.println("id = "+Emp_id);
		System.out.println("name = "+Emp_name);
		System.out.println("Designation = "+Emp_city);
		System.out.println("salary = "+Emp_salary);
	}
	public static void main(String[] args)
	{
		Emp E=new Emp(0001,"Gururaj","Sangli",1000000);
		E.show();
	}
}