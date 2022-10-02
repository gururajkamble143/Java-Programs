
public class Overloading_area 
{
	void find(long l, long b)
	{
		System.out.println("Area is = "+(l+b));
	}
	void find(int l, int b, int h)
	{
		System.out.println("Area is = "+(l+b+h));
	}
	public static void main(String[] args)
	{
		Overloading_area a=new Overloading_area();
		a.find(5, 10);
		a.find(5, 10, 15);
	}
}
