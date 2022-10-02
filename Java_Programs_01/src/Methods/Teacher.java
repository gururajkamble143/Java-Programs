import java.util.*;
class student
{
	private
	int rollno;
	String name;
	double marks;
	
	public
	void accept()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter ROll no. = ");
		rollno=obj.nextInt();
		System.out.println("Enter Name = ");
		name=obj.next();
		System.out.println("Enter Marks = ");
		marks=obj.nextDouble();
	}
	void display()
	{
		System.out.println("ROll no. = "+rollno);
		System.out.println("Name = "+name);
		System.out.println("marks = "+marks);

		
	}
}
public class Teacher {
	public static void main(String[] args)
{
	student s1=new student();
	s1.accept();
	s1.display();
}
}
