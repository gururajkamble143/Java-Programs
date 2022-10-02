import java.util.Scanner;

public class Digits_in_num 
{
    public static void main(String[] args) 
    {
        int num, count=0;
        System.out.print("Enter any number = ");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();

        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println("digits in the number are = "+count);
    }
}
