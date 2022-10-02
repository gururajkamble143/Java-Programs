import java.util.Scanner;

public class Eligible_student 
{
    public static void main(String[] args) 
    {
        int class_held, class_attend, a_percent;
        System.out.println("enter the number of classes held = ");
        Scanner held=new Scanner(System.in);
        class_held=held.nextInt();
        System.out.println("Enter the number of classes attended = ");
        Scanner attend=new Scanner(System.in);
        class_attend=attend.nextInt();

        a_percent = class_attend * 100 / class_held;
        System.out.println("class attendence percentage = "+a_percent);

        if(a_percent<75)
        {
            System.out.println("Student is not allowed to sit in exam");
        }
        else
        {
            System.out.println("Student is allowed to sit in exam");
        }
        
    }
}
