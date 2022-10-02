package String;

public class Largest_and_smallest_word 
{
	public static void main(String[] args)
	{
		String str="I am gonna be the full Stack Developer one day";
		String word=" ", small=" ", large=" ";
		String[] words=new String[50];
		int lenght=0;
		str = str + " ";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				word = word + str.charAt(i);
			}
			else
			{
				words[lenght]=word;
				lenght++;
				word=" ";
			}
		}
		small=large=words[0];
		for(int j=0;j<lenght;j++)
		{
			if(small.length()>words[j].length())
				small=words[j];
			if(large.length()<words[j].length())
				large=words[j];
		}
		System.out.println("Smallest word = "+small);
		System.out.println("Largest word = "+large);
	}
}
