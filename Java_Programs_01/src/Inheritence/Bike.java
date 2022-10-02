
public class Bike 
{
	final int speedlimit=40;
	public void run()
	{
		speedlimit=400;
	}
	public static void main(String[] args)
	{
		Bike obj=new Bike();
		obj.run();
	}
}
