import java.util.Scanner;

public class Reverse_no 
{
    public static void main(String[] args) 
    {
        int n,rem;
        System.out.println("Enter any number = ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();

        while(n!=0)
        {
            rem=n%10;
            System.out.print(+rem);
            n=n/10;
        }
    }
}
