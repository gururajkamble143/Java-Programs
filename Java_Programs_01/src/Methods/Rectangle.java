import java.util.*;

class Rect 
{
	private
	int lenght,width,area;
	
	public
	void accept()
	{
		System.out.println("Enter the lenght = ");
		Scanner obj=new Scanner(System.in);
		lenght=obj.nextInt();
		System.out.println("Enter the width = ");
		width=obj.nextInt();
	}
	void display()
	{
		area = lenght * width;
		
		System.out.println(lenght+ "\t" +width+ "\t" +area);
	}
}
public class Rectangle 
{
	public static void main(String[] args)
	{
		Rect r[]=new Rect[3];
		int i;
		for(i=0;i<3;i++) 
		{
			r[i]=new Rect();
		}
		for(i=0;i<3;i++)
		{
			r[i].accept();
		}
		System.out.println("lenght\twidth\tarea");
		for(i=0;i<3;i++)
		{
			r[i].display();
		}
	}
}
