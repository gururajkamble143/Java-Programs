import java.util.Scanner;

public class Facto 
{
    public static void main(String[] args) 
    {
        int i=1,fact=1,n;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        do
        {
            fact=fact*i;
            i++;
        }
        while(i<=n);
        System.out.println("factorial = "+fact);
    }
    
}
