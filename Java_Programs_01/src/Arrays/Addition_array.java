import java.util.Scanner;

public class Addition_array 
{
	public static void main(String[] args) 
	{
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		int i,j;
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter a matrix = ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) 
			{
				a[i][j]=obj.nextInt();
			}
		}
		
		System.out.println("Enter b matrix = ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=obj.nextInt();
			}
		}
		
		System.out.println("Addition of a and b matrix = ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]);
			}
		}
	}
}
