import java.util.Scanner;

public class Java_practice 
{
        public static void main(String args[]) 
    {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of a = ");
        a=in.nextInt();
        System.out.println("enter the value of b = ");
        b=in.nextInt();

        c=a+b;
        System.out.println("addition of a and b is = "+c);
    }
}