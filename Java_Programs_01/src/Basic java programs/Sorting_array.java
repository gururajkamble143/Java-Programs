import java.util.*;
import java.util.Arrays;

public class Sorting_array 
{
    public static void main(String[] args) 
    {
        int[] a=new int[5];
        int i;
        Scanner obj=new Scanner(System.in);
        
        System.out.println("enter the elements = ");
        for(i=0;i<a.length;i++)
        {
            a[i]=obj.nextInt();
        }
        Arrays.sort(a);
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}
