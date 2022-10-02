import java.util.Scanner;

public class Sum_of_n_natural 
{
    public static void main(String[] args) 
    {
        int n,sum=0,i;
        System.out.println("Enter the range = ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();

        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of "+n+" first numbers = "+sum);
    }
}
