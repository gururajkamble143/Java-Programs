package Inheritence;

class employee
{
	protected
	int id;
	String name;
	
	public
	employee(int i, String n)
	{
		id=i;
		name=n;			
	}
}
public class Department extends employee
{
	private
	String Designation;
	double salary;
	
	public
	Department(int i, String n,String d,double s)
	{
		super(i,n);
		Designation=d;
		salary=s;
	}	
	void show()
	{
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("Designation = "+Designation);
		System.out.println("salary = "+salary);
	}
	public static void main(String[] args)
	{
		Department d=new Department(1,"Guru","Developer",9000000);
		d.show();
	}
}
