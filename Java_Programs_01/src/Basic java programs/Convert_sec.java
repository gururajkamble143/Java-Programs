import java.util.Scanner;

public class Convert_sec 
{
    public static void main(String[] args) 
    {
        int sec;
        float hr, min;
        System.out.println("enter the seconds to be converted = ");
        Scanner se=new Scanner(System.in);
        sec=se.nextInt();

        hr = sec / 3600;
        min = sec / 60;

        System.out.println("seconds into hours = "+hr);
        System.out.println("seconds into minutes = "+min);

    }
}
