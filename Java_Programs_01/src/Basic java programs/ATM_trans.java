import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class ATM_trans 
{
    public static void main(String[] args) 
    {
        int b_balance=10000, deposit, withdraw;
        Scanner ch=new Scanner(System.in);

        while(true)
        {
            System.out.println("choose 1 for Withdraw");
            System.out.println("choose 2 for Deposit");
            System.out.println("choose 3 for Check balance");
            System.out.println("choose 4 for EXIT");
            System.out.println("Enter the choice = ");

            int choice=ch.nextInt();

            switch(choice)
            {
                case 1:
                System.out.println("Enter the money you want to Withdraw = ");
                withdraw=ch.nextInt();
                if(b_balance>=withdraw)
                {
                    b_balance = b_balance - withdraw;
                    System.out.println("remaining balance = "+b_balance);
                }
                else
                {
                    System.out.println("insufficient balance");
                }
                break;

                case 2:
                System.out.println("Enter the money you want to Deposit = ");
                deposit=ch.nextInt();
    
                   b_balance = b_balance + deposit;
                    System.out.println("remaining balance = "+b_balance);
                    break;

                case 3:
                System.out.println("Your Bank balance is = "+b_balance);
                break;

                case 4:
                System.out.println("Your Transaction is done!!!!!");
                
                System.exit(0);
            }

        }
    }
}
