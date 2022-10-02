import java.util.Scanner;

public class Biggest_among_three 
{
    public static void main(String[] args) 
    {
        int a,b,c;
        System.out.println("enter three values = ");
        Scanner number=new Scanner(System.in);
        a=number.nextInt();
        b=number.nextInt();
        c=number.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is biggest");
            }
            else
            {
                System.out.println("c is biggest");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b is biggest");
            }
            else
            {
                System.out.println("c is biggest");
            }
        }
    }
}
