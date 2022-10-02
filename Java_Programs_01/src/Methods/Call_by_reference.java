
public class Call_by_reference 
{
	int x=10;
	int y=20;
	
	public void call_reference(Call_by_reference t)
	{
		t.x=100;
		t.y=200;
	}
	public static void main(String[] args)
	{
		Call_by_reference ts=new Call_by_reference();
		System.out.println("before = "+ts.x+" "+ts.y);
		ts.call_reference(ts);
		System.out.println("after = "+ts.x+" "+ts.y);
	}
}
