package Inheritence;

class parent2
{
	String name;
	public void Details()
	{
		name="parent";
		System.out.println(name);
	}
}

public class Child2 extends parent2 
{
	String name;
	public void Details()
	{
		super.Details();
		name="Child";
		System.out.println(name);
	}
	public static void main(String[] args)
	{
		Child2 obj=new Child2();
		obj.Details();
	}
}
