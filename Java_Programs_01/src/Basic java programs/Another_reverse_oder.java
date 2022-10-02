import java.util.*;

public class Another_reverse_oder 
{
    public static void main(String[] args) 
    {
        int[] a=new int[5], b=new int[5];
        int i,j;

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first array elements = ");

        for(i=0;i<=4;i++)
        {
            a[i]=obj.nextInt();
        }
        for(i=4,j=0;i>=0;i--,j++)
        {
            b[j]=a[i];
        }

        System.out.println("reverse elements of a copied in b = ");
        for(j=0;j<=4;j++)
        {
            System.out.println(b[j]);
        }
    }
}
