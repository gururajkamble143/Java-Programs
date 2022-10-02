import java.util.Scanner;

public class Palindrom 
{
    public static void main(String[] args) 
    {
        int j,n,rem=0,temp;
        System.out.println("enter any number = ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        temp=n;
        while(n>0)
        {
            j=n%10;
            rem=rem*10+j;
            n=n/10;
        }
        if(temp==rem)
        {
            System.out.println("palindrom number");
        }
        else
        {
            System.out.println("not a palindrom");
        }
    }
}