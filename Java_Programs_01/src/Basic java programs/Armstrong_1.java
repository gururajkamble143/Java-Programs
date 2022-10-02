import java.util.Scanner;

public class Armstrong_1 
{
    public static void main(String[] args) 
    {
       int i,temp,sum=0,n;
       System.out.println("Enter any number = ");
       Scanner obj=new Scanner(System.in);
       n=obj.nextInt();
       
       temp=n;
       while(n>0)
       {
            i=n%10;
            sum=sum+(i*i*i);
            n=n/10;
       }
       if(sum==temp)
       {
            System.out.println(temp+" is a armstrong number");
       }
       else
       {
            System.out.println(temp+" is not a armstrong number");
       }
    }
}
