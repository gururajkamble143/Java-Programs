import java.util.Scanner;

public class Fact1 
{
   public static void main(String[] args) 
   {
        int i=1,n,fact=1;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        do
        {
            fact=fact*i;
            i++;
        }   while (i<=n);     
        
   }
   System.out.println("factorial = "+fact);
}
