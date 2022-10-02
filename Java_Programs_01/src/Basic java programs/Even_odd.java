import java.util.Scanner;

public class Even_odd 
{
    public static void main(String[] args) 
    {
        
        int n;
            Scanner obj=new Scanner(System.in);
            System.out.println("enter the value of n = ");
            n=obj.nextInt();
            if(n%2==0)
            {
                System.out.println("Even number");
            }
            else
            {
                System.out.println("odd number");
            }

    }
}