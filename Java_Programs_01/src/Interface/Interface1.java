package Interface;

interface movable
{
	int avg_speed = 40;
	void move();
}

public class Interface1 implements movable
{
	public void move() 
	{
		System.out.println("Average Speed = "+avg_speed);
	}
	public static void main(String[] args)
	{
		Interface1 v1=new Interface1();
		v1.move();
	}
}
