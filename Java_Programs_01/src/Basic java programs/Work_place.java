import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Work_place 
{
    public static void main(String[] args) 
    {
        int age;
        char sex, marital_status;

        System.out.println("Enter the age = ");
        Scanner ag=new Scanner(System.in);
        age=ag.nextInt();
        System.out.println("Enter the sex from 'M for Male' and 'F for Female' = ");
        Scanner se=new Scanner(System.in);
        sex=se.next().charAt(0);
        System.out.println("Enter the Marital status from 'Y for Married' and 'N for Unmarried' = ");
        Scanner ma=new Scanner(System.in);
        marital_status=ma.next().charAt(0);

        if(sex=='F')
        {
            System.out.println("Employee can work only in urban areas");
        }
        else if(sex=='M')
        {
            if(age>=20 && age<=40)
            {
                System.out.println("Employee can work anywhere");
            }
            else if(age>40 && age<=60)
            {
                System.out.println("Employee can work only in urban areas");
            }
            else
            {
                System.out.println("ERROR");
            }
        }
        else
        {
                System.out.println("ERROR");
        }
    }
}
