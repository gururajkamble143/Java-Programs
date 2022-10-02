import java.util.Scanner;

class Number 
{
	private
	int a,i;
	public
	void accept()
	{
		System.out.println("Guess the number = ");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
	}
	void display()
	{	
			if(a<5)
			{
				System.out.println("your choice number is too low");
				System.out.println("Try Again....");
			}
			else if(a>5)
			{
				System.out.println("your choice is too high");
				System.out.println("Try Again....");
			}
			else if(a==5)
			{
				System.out.println("You winnnn!!!!!!!!!!!");
			}
	}
}
public class Guess_number
{
	public static void main(String[] args)
	{
		Number n=new Number();
		n.accept();
		n.display();
	}
}
