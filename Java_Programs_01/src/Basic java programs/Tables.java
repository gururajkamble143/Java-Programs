import java.util.Scanner;

public class Tables 
{
    public static void main(String[] args) 
    {
        int n,i;
        System.out.println("Enter the range = ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();

        for(i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
