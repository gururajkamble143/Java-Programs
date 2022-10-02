import java.util.Scanner;

public class Print_n_natural 
{
    public static void main(String[] args) 
    {
        int n,i;
        System.out.println("enter the range = ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();

        for(i=0;i<=n;i++)
        {
            System.out.println(i+"\t");
        }
    }
}
