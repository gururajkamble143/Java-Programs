package String;

public class Replacing_characters 
{
	public static void main(String[] args)
	{
		String str1= " I am hero";
		String str2=" ";
		int len=str1.length();
		
		for(int i=0;i<len;i++)
		{
			if(str1.charAt(i)!=' ')
			{
				str2=str2+str1.charAt(i);
			}
			else
			{
				str2=str2+'@';
			}
		}
		System.out.println("After replacing white spaces with characters = ");
		System.out.println(str2);
	}
}
