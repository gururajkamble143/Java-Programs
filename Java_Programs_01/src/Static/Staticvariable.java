
public class Staticvariable 
{
	static int x=100;
	int y=100;
	public void increment()
	{
		x++;
		y++;
	}
	public static void main(String[] args)
	{
		Staticvariable t1=new Staticvariable();
		Staticvariable t2=new Staticvariable();
		System.out.println(Staticvariable.x);
		System.out.println(t2.y);
		
		t1.increment();
		t2.increment();
		
		System.out.println(Staticvariable.x);
		System.out.println(t2.y);
	}
}
