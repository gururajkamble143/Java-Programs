import java.util.Scanner;

public class Array_ 
{
    public static void main(String[] args) 
    {
        int[] a=new int[10];
        int i;

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter array elements");
        for(i=0;i<=4;i++)
        {
            a[i]=obj.nextInt();
        }
        for(i=0;i<=4;i++)
        {
            System.out.println(a[i]);
        }
    }
}
