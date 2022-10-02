import java.util.Scanner;

public class Palindrom_01 
{
    public static void main(String[] args) 
    {
        int n,temp,sum=0,j;
        System.out.println("Enter any number = ");
        Scanner num=new Scanner(System.in);
        n=num.nextInt();

        temp=n;
        while(n!=0)
        {
            j=n%10;
            sum=sum*10+j;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("number is Palindrom");
        }
        else
        {
            System.out.println("number is not Palindrom");
        }

    }
}
