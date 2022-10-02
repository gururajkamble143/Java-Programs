import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Sort_10 
{
    public static void main(String[] args) 
    {
        int[] a=new int[10];
        int i;
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the array elements = ");

        for(i=0;i<=4;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Entered Array elements are = ");
        for(i=0;i<=4;i++)
        {
           System.out.println(a[i]);
        }
    }    
}
