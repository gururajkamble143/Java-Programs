
public class Calculate_method_overloading 
{
	void sum(int a, int b)
	{
		System.out.println("sum of a and b is = "+(a+b));
	}
	void sum(float a,float b)
	{
		System.out.println("sum of a and b is = "+(a+b));
	}
	public static void main(String[] args)
	{
		Calculate_method_overloading c=new Calculate_method_overloading();
		c.sum(5, 3);
		c.sum(5.5f, 3.3f);
	}
}
