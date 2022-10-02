
import java.util.*;
class Vehicle
{
	private
	int modelno;
	String carname;
	double price;
	
	public
	void accept()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Model no. = ");
		modelno=obj.nextInt();
		System.out.println("Enter car Name = ");
		carname=obj.next();
		System.out.println("Enter Price = ");
		price=obj.nextDouble();
	}
	void display()
	{
		System.out.println("\nMOdel no. = "+modelno);
		System.out.println("\tCar Name = "+carname);
		System.out.println("\tPrice = "+price);
	}
}
public class Car 
{
	public static void main(String[] args)
{ 
			{
				Vehicle v[]=new Vehicle[3];
				int i;
				for(i=0;i<3;i++)
				{
					v[i]=new Vehicle();
				}
				for(i=0;i<3;i++)
				{
					v[i].accept();
				}
				for(i=0;i<3;i++)
				{
					v[i].display();
				}
			}
		}
}

