package String;

public class Remove_whitespace 
{
	public static void main(String[] args)
	{
		String str1= "     I  am  hero";
		String str2=" ";
		int len=str1.length();
		
		for(int i=0;i<len;i++)
		{
			if(str1.charAt(i)!=' ')
			{
				str2=str2+str1.charAt(i);
			}
		}
		System.out.println("After removing whitespaces = ");
		System.out.println(str2);
	}
}
