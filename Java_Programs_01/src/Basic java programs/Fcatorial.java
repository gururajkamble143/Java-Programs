import java.util.Scanner;

public class Fcatorial 
{
    public static void main(String[] args) 
    {
        int n,i=1,fact=1;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        while (i<=n) 
        {
            fact=fact*i;
            i++;    
        }
        System.out.println("factorial = "+fact);
    }
}
