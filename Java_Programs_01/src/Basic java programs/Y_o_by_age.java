import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Y_o_by_age 
{
    public static void main(String[] args) 
    {
        int age;
        System.out.println("Enter the age = ");
        Scanner obj=new Scanner(System.in);
        age=obj.nextInt();
        if(age<=12)
        {
            System.out.println("The Person is a child");
        }
        else if(13<=age && age<=19)
        {
            System.out.println("The Person is a teenager");
        }
        else if(20<=age && age<=50)
        {
            System.out.println("The Person is Young");
        }
        else
        {
            System.out.println("The Person is old");
        }
    }
}
