
public class Narrowing_casting 
{
	public static void main(String[] args)
	{
		float f=(float)100.04;
		long l=(long)f;
		int i=(int)l;
		
		System.out.println("float value = "+f);
		System.out.println("long value = "+l);
		System.out.println("int value = "+i);
	}
}
