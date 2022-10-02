import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Basic_calculator 
{
    public static void main(String[] args) 
    {
        int a,b,c,number;
        System.out.println("Enter two numbers = ");
        Scanner num=new Scanner(System.in);
        a=num.nextInt();
        b=num.nextInt();
        System.out.println("choose '1' for Addition, '2' for Substraction, '3' for multiplication, '4' for division");
        Scanner choice=new Scanner(System.in);
        number=choice.nextInt();

        if(number<=4)
        {
            switch(number)
            {
                case 1:
                {
                    c = a + b;
                    System.out.println("Addition of "+a+" & "+b+" is = "+c);
                }
                case 2:
                {
                    c = a - b;
                    System.out.println("Substraction of "+a+" & "+b+" is = "+c);
                }
                case 3:
                {
                    c = a * b;
                    System.out.println("Multiplication of "+a+" & "+b+" is = "+c);
                }
                case 4:
                {
                    c = a / b;
                    System.out.println("Division of "+a+" & "+b+" is = "+c);
                }
            }
        }
        else
        {
            System.out.println("Your input is Wrong");
        }
    }
}
