import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args)
    {
        int n,j,rem=0,temp;
        System.out.println("enter any number = ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();  
        temp=n;
        while(n>0)
        {
            j=n%10;
            rem=rem+(j*j*j);
            n=n/10;
        }  
        if(temp==rem)
        {
            System.out.println(temp+ " is a armstrong number");
        }
        else
        {
            System.out.println(temp+ " is not a armstrong number");
        }
    }
}
