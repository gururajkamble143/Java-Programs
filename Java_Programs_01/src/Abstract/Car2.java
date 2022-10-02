package Abstract;

abstract class Vehicle2
{
	public abstract void engine();
}
public class Car2 extends Vehicle2
{
	public void engine()
	{
		System.out.println("Car Engine");
	}

public static void main(String[] args)
{
	Vehicle2 obj=new Car2();
	obj.engine();
}
}