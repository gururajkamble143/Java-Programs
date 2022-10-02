import java.util.Scanner;

public class Benjamin_of_bulbs 
{
    public static void main(String[] args) 
    {
        int n,i;
        System.out.println("enter the number = ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();

        for(i=1;i*i<=n;i++)
        {
            System.out.println(i*i);
        }
    }
}
