import java.util.*;

class Customer 
{
	private 
	int n;
	int acc_no;
	private int b_bal;
	int[] a=new int[n];
	String name;
	
	public
	void accept()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name of customer = ");
		name=obj.next();
		System.out.println("Account number = ");
		acc_no=obj.nextInt();
		System.out.println("Enter the bank balance = ");
		b_bal=obj.nextInt();		
	}
	void display()
	{
		System.out.println(name+ "\t" +acc_no+ "\t" +b_bal);
	}
}
public class Bank
{
	public static void main(String[] args)
	{
		int i,n,deposit,withdraw,b_bal = 0,check_no,acc_no;
		System.out.println("Enter the number of customers = ");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		
		Customer c1[]=new Customer[n];
		for(i=0;i<n;i++)
		{
			c1[i]=new Customer();
		}
		for(i=0;i<n;i++)
		{
			c1[i].accept();
		}
		
		while(true)
		{
			System.out.println("choose 0 for view all the details");
			System.out.println("choose 1 for choose the customer");
			System.out.println("choose 2 for Withdraw");
	        System.out.println("choose 3 for Deposit");
	        System.out.println("choose 4 for Check balance");
	        System.out.println("choose 5 for EXIT");
	        System.out.println("Enter the choice = ");
	          
	          Scanner ch=new Scanner(System.in);
	          int choice=ch.nextInt();
	          
	          switch(choice)
	            {
	            	case 0:
	            	{
	            		System.out.println("Name \t acc_no \t bank_bal");
	            		for(i=0;i<n;i++)
	            		{
	            			c1[i].display();
	            		}
	            		break;
	            	}
	                case 2:
	                System.out.println("Enter the money you want to Withdraw = ");
	                withdraw=ch.nextInt();
	                if(b_bal>=withdraw)
	                {
	                    b_bal = b_bal - withdraw;
	                    System.out.println("remaining balance = "+b_bal);
	                }
	                else
	                {
	                    System.out.println("insufficient balance");
	                }
	                break;
	                
	                case 1:
	                {
	                	System.out.println("Enter the account you want to choose = ");
	                	Scanner check=new Scanner(System.in);
	                	check_no=check.nextInt();      	
	                	for(i=0;i<n;i++)
	                	{
	                		if(c1[i].acc_no==check_no)
	                		{
	                			c1[i].display();
	                		}
	                		else
	                		{
	                			System.out.println("Account doesn't Exist");
	                		}
	                	}
	                }

	                case 3:
	                System.out.println("Enter the money you want to Deposit = ");
	                deposit=ch.nextInt();
	    
	                   b_bal = b_bal + deposit;
	                    System.out.println("remaining balance = "+b_bal);
	                    break;

	                case 4:
	                System.out.println("Your Bank balance is = "+b_bal);
	                break;

	                case 5:
	                System.out.println("Exit");
	                
	                System.exit(0);
	            }
		}		
	}
}