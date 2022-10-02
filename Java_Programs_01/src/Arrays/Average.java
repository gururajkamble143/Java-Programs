import java.util.*;

class mark 
{
	private 
	int mark1,mark2,mark3,average;
	
	public
	void accept()
	{
		System.out.println("Enter the mark 1 = ");
		Scanner obj=new Scanner(System.in);
		mark1=obj.nextInt();
		System.out.println("Enter the mark 2 = ");
		mark2=obj.nextInt();
		System.out.println("Enter the mark 3 = ");
		mark3=obj.nextInt();
	}
	void display()
	{
		average = (mark1 + mark2 + mark3) / 3;
		
		System.out.println("average = "+average);
	}
}
public class Average
{
	public static void main(String[] args)
	{
		mark m1=new mark();
		m1.accept();
		m1.display();
	}
}
