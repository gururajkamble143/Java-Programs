package String;

public class Frequency_of_characters 
{
	public static void main(String[] args)
	{
		String str = "The Attack on Titan";
		int[] frequency = new int [str.length()];
		System.out.println("Entered String is = "+str);
		
		char str1[] = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			frequency[i]=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(str1[i]==str1[j])
				{
					frequency[i]++;
					
					str1[j]='0';
				}
			}
		}
		System.out.println("Characters are repeated as follows = ");
			for(int i=0;i<frequency.length;i++)
			{
				if(str1[i]!=' ' && str1[i]!='0')
					System.out.println(str1[i]+" "+frequency[i]);
			}
	}
}
