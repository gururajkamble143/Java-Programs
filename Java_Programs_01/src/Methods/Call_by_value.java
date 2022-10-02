
public class Call_by_value 
{
	public void call_value(int x)
	{
		x=100;
	}
	public static void main(String[] args)
	{
		int x=50;
		Call_by_value c1=new Call_by_value();
		c1.call_value(50);
		System.out.println(x);
	}
}
