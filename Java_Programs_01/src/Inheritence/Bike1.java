
public class Bike1 
{
	final void run()
	{
		System.out.println("running");
	}
	
}
public class Honda extends Bike1
{
	public void run()
	{
		System.out.println("running safely with 100km");
	}
	public static void main(String[] args)
	{
		Honda h1=new Honda();
		h1=run();
	}
}
