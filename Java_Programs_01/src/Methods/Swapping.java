import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		int A,B;
		System.out.println("Enter value of A = ");
		Scanner obj=new Scanner(System.in);
		A=obj.nextInt();
		System.out.println("Enter value of B = ");
		B=obj.nextInt();
		
		A=A^B;
		B=A^B;
		A=A^B;
		
		System.out.println("After swapping A = "+A);
		System.out.println("After swapping B = "+B);
	}

}
