import java.util.Scanner;

public class Total_notes {
    public static void main(String[] args) 
    {
        int amount,r2000=0,r500=0,r200=0,r100=0,r50=0,r20=0,r10=0,r5=0,r2=0,r1=0,count=0;
        System.out.println("enter the amount = ");
        Scanner amt=new Scanner(System.in);
        amount=amt.nextInt();
        if(amount>=2000)
        {
            r2000=amount/2000;
            amount=amount%2000;
            System.out.println("notes of 2000 = "+r2000);

        } 
        if(amount>=500)
        {
            r500=amount/500;
            amount=amount%500;
            System.out.println("notes of 500 = "+r500);

        }   
        if(amount>=2000)
        {
            r200=amount/200;
            amount=amount%200;
            System.out.println("notes of 200 = "+r200);

        }
        if(amount>=100)
        {
            r100=amount/100;
            amount=amount%100;
            System.out.println("notes of 100 = "+r100);

        }
        if(amount>=50)
        {
            r50=amount/50;
            amount=amount%50;
            System.out.println("notes of 50 = "+r50);

        }
        if(amount>=20)
        {
            r20=amount/20;
            amount=amount%20;
            System.out.println("notes of 20 = "+r20);

        }
        if(amount>=10)
        {
            r10=amount/10;
            amount=amount%10;
            System.out.println("notes of 10 = "+r10);

        }
        if(amount>=5)
        {
            r5=amount/5;
            amount=amount%5;
            System.out.println("notes of 5 = "+r5);

        }
        if(amount>=2)
        {
            r2000=amount/2;
            amount=amount%2;
            System.out.println("coin/s of 2 = "+r2);

        }
        if(amount>=1)
        {
            r1=amount/1;
            amount=amount%1;
            System.out.println("coin/s of 1 = "+r1);

        }
        count=r2000+r500+r200+r100+r50+r20+r10+r5+r2+r1;

        System.out.println("Total number of notes = "+count);
    }
}
