import java.util.Scanner;

public class Basic_sal 
{
    public 
    static void main(String[] args) 
    {
        int bs,hra,ta,bonus,netsal;
        Scanner obj=new Scanner(System.in);
        bs=obj.nextInt();
        if(bs>=10000)
        {
            hra=bs*10/100;
            ta=bs*5/100;
            bonus=2400;
        }
        else
        {
            hra=bs*5/100;
            ta=bs*5/100;
            bonus=1500;
        }
        netsal=bs+hra+ta+bonus;
        System.out.println("netsal = "+netsal);

    }
}
