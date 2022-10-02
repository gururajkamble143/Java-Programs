package Arrays;

public class Code_price 
{
	protected String code;
	protected int price;
	
	public Code_price(String C, int P)
	{
		code=C;
		price=P;
	}
}
class object
{
	public static void main(String[] args)
	{
		Code_price[] pri=new Code_price[5];
		pri[0]=new Code_price("java",100);
		pri[1]=new Code_price("CSS",200);
		pri[2]=new Code_price("HTML",300);
		pri[3]=new Code_price("C++",400);
		pri[4]=new Code_price("Bootstrap",500);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("   Code for object = "+pri[i].code+ "     Price for object = "+pri[i].price);
		}
	}
	
}
