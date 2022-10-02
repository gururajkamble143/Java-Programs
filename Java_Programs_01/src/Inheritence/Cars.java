package Inheritence;
class Brands
{
	protected
	int car_no;
	String car_name;
	
	public
	Brands(int i, String n)
	{
		car_no=i;
		car_name=n;			
	}
}
public class Cars extends Brands 
{
	private
	String Brand_name;
	int car_price;
	
	public
	Cars(int i, String n,String d,int s)
	{
		super(i,n);
		Brand_name=d;
		car_price=s;
	}
	void show()
	{
		System.out.println("car number = "+car_no);
		System.out.println("car name = "+car_name);
		System.out.println("Brand name = "+Brand_name);
		System.out.println("car price = "+car_price);
	}
	public static void main(String[] args)
	{
		Cars d=new Cars(007,"McLaren","SKODA",500000);
		d.show();
	}
}
