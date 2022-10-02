import java.util.Scanner;

public class Bonus5 
{
    public static void main(String[] args) 
    {
        int sal,s_year,b_sal;
        System.out.println("Enter the basic salary of the employee = ");
        Scanner salary=new Scanner(System.in);
        sal=salary.nextInt();

        System.out.println("Enter the years of service = ");
        Scanner year=new Scanner(System.in);
        s_year=year.nextInt();

        if(s_year>5)
        {
            b_sal = sal + (5*sal) / 100;
            System.out.println("Total net bonus amount is = "+b_sal);
        }
        else
        {
            System.out.println("Employee is not eligible for bonus");
            System.out.println("total salary = "+sal);
        }
    }
}
