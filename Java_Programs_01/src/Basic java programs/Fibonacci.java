import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int a=0,b=1,c,n,i;
        System.out.println("Enter the range = ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();

        System.out.println("Fibonacci Series = ");
        System.out.println("\t"+a);
        System.out.println("\t"+b);


        for(i=1;i<=n;i++)
        {
            c=a+b;
            System.out.println("\t"+c);
            a=b;
            b=c;
        }
    }
}
