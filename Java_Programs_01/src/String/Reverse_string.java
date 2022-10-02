package String;

public class Reverse_string 
{
	public static void main(String[] args)
	{
		String str="GURURAJ";
		String word=" ";
		char ch;
		System.out.println("Original word = "+str);
		str.length();
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			word=ch+word;
		}
		System.out.println("Reverse word = "+word);
		
	}
}
