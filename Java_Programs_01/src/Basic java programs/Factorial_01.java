import java.util.Scanner;

public class Factorial_01 
{
    public static void main(String[] args) 
    {
        int n,temp,fact=1;
        System.out.println("Enter any Number = ");
        Scanner num=new Scanner(System.in);
        n=num.nextInt();
        temp=n;
        while(n!=1)
        {
            fact=fact*n;
            n=n-1;
        }
        System.out.println("factorial of "+temp+" is = "+fact);
    }
}
