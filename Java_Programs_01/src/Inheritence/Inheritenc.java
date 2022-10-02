package Inheritence;

class parent
{
	public void p1()
	{
		System.out.println("Parent method");
	}
}
public class Inheritenc extends parent
{
	public void c1()
	{
		System.out.println("Child method");
	}
	public static void main(String[] args)
	{
		Inheritenc obj=new Inheritenc();
		obj.p1();
		obj.c1();
	}
}