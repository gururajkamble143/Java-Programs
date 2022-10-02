import java.util.Scanner;

public class Odd_even 
{
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter any number = ");
        Scanner num=new Scanner(System.in);
        n=num.nextInt();

        if(n%2==0)
        {
            System.out.println(n+" is even");
        }
        else
        {
            System.out.println(n+" is odd");
        }
    }
}
