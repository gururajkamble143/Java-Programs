import java.util.*;

public class Positive_neg_oddeven 
{
    public static void main(String[] args) 
    {
        int[] a=new int[5];
        int i,positive=0,negative=0,odd=0,even=0,zero=0;

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the array elements = ");

        for(i=0;i<=4;i++)
        {
            a[i]=obj.nextInt();
        }

        for(i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                positive++;
            }
            else if(a[i]<0)
            {
                negative++;
            }
            else if(a[i]==0)
            {
                zero++;
            }
            if(a[i]%2==0)
            {
                if(a[i]!=0)
                {
                    even++;
                }
            }
            else
            {
                odd++;
            }
        }


        System.out.println("total positive numbers = "+positive);
        System.out.println("total negative numbers = "+negative);
        System.out.println("total zeros = "+zero);
        System.out.println("total even numbers = "+even);
        System.out.println("total odd numbers = "+odd);
    }
}
