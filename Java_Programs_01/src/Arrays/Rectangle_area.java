package Arrays;

public class Rectangle_area
{
	protected int lenght;
	protected int bredth;
	
	public Rectangle_area(int l,int b)
	{
		lenght=l;
		bredth=b;
	}
}
class Area
{
	public static void main(String[] args)
	{
		Rectangle_area[] area=new Rectangle_area[3];
		area[0]=new Rectangle_area(2,4);
		area[1]=new Rectangle_area(4,6);
		area[2]=new Rectangle_area(7,5);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Area of Rectangle is = "+area[i].lenght*area[i].bredth);
		}
	}
}
