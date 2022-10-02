class Brand
{
	private 
	String ford;
	
	Brand()
	{
		ford = "brand";
	}
	
	public String getbrand()
	{
		return ford;
	}
}
public class Car_constructor 
{
	public static void main(String[] args)
	{
		Brand c = new Brand();
		String ford = c.getbrand();
		System.out.println(ford+" name is Ford");
	}
}
