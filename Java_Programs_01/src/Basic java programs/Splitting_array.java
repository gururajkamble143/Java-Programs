import java.util.Scanner;

public class Splitting_array 
{
    public static void main(String[] args) 
    {
        int[] a=new int[10], b=new int[5], c=new int[5];
        int i;

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Array elements = ");

        for(i=0;i<10;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("First split = ");
        for(i=0;i<5;i++)
        {
            b[i]=a[i];
            System.out.println(b[i]);
        }
        System.out.println("Second split = ");
        for(i=0;i<5;i++)
        {
            c[i]=a[i+5];
            System.out.println(c[i]);
        }
    }
}
