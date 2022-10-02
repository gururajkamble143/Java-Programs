class Area
{
	private 
	double radius;
	String color;
	
	Area()
	{
		radius = 1.0;
		color = "red";
	}
	Area(double radius)
	{
		this.radius=radius;
	}
	public double getradius()
	{
		return radius;
	}
	public double getarea()
	{
		return 3.14*radius*radius;
	}
}
public class Radius_area 
{
	public static void main(String[] args)
	{
		Area a=new Area();
		double radius = a.getradius();
		double area = a.getarea();
		
		System.out.println("color of circle is "+a.color);
		System.out.println("Area of circle = "+area);
		
		Area a1=new Area(2.0);
		radius = a1.getradius();
		area = a1.getarea();
		a1.color = "pink";
		
		System.out.println("color of circle is "+a1.color);
		System.out.println("Area of circle = "+area);
	}
}
