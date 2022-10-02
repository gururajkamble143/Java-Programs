package Inheritence;

class parent1
{
	String name;
}

public class Child1 extends parent1
{
	String name;
	public void details()
	{
		super.name="parent";
		name="child";
		
		System.out.println(super.name+" "+name);
	}
	public static void main(String[] args)
	{
		Child1 c1=new Child1();
		c1.details();
				
	}
}
