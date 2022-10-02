import java.util.Scanner;

public class Add_even_mul_odd 
{
    public static void main(String[] args) 
    {
        int n, even_sum=0, odd_mul=1,i;
        System.out.println("Enter the number = ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        while(n!=0)
        {
            i=n%10;
            if(i%2==0)
            {
                even_sum=even_sum+i;
            }
            else
            {
                odd_mul=odd_mul*i;
            }
            n=n/10;
        }
        System.out.println("sum of even digits of number = "+even_sum);
        System.out.println("multiplication of odd digits of number = "+odd_mul);

    }
}
