import java.util.Arrays;
import java.util.Scanner;

public class Largest_smallest 
{
    public static void main(String[] args) 
    {
        int[] a=new int[5];
        int n,i;

        System.out.println("Enter the size of an array = ");
        Scanner nw=new Scanner(System.in);
        n=nw.nextInt();

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the array elements = ");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }

        Arrays.sort(a);

        System.out.println("Largest element = "+a[n-1]);
        System.out.println("Smallest element = "+a[0]);

        System.out.println("Second Smallest element = "+a[1]);
        System.out.println("Second largest element = "+a[n-2]);
        
    }
}
