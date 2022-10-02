import java.util.Scanner;

public class Adding_digits_of_number 
{
    public static void main(String[] args) 
    {
        int n, i, sum=0;
        System.out.println("Enter any number = ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();

        while(n!=0)
        {
            i=n%10;
            sum=sum+i;
            n=n/10;
        }
        System.out.println("sum of digits of number = "+sum);
    }
}
