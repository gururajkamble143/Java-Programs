import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Insured_driver 
{
    public static void main(String[] args) 
    {
        int age;
        char marital_status, sex;

        System.out.println("Enter the age = ");
        Scanner ag=new Scanner(System.in);
        age=ag.nextInt();
        System.out.println("Enter the marital status if 'married type Y' and if 'unmarried type N' = ");
        Scanner ma=new Scanner(System.in);
        marital_status=ma.next().charAt(0);
        System.out.println("Enter the sex if 'male type M' and if 'female type F' = ");
        Scanner se=new Scanner(System.in);
        sex=se.next().charAt(0);

        if(marital_status=='Y')
        {
            System.out.println("The driver is Ensured");
        }
        else if(marital_status=='N')
        {
            if(sex=='M' && age>30)
            {
                System.out.println("The driver is Ensured");
            }
            else if(sex=='F' && age>25)
            {
                System.out.println("The driver is Ensured");
            }
            else
            {
                System.out.println("The driver is not Ensured");
            }
        }
    }
}
