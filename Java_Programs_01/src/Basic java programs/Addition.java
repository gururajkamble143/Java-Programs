import java.util.Scanner;

public class Addition 
{
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a = ");
        a=in.nextInt();
        System.out.println("enter b = ");

        b=in.nextInt();
        c=a+b;
        System.out.println("addition of a and b is = "+c);

    }
}
