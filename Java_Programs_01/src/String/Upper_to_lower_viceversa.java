package String;

public class Upper_to_lower_viceversa 
{
	public static void main(String[] args)
	{
		String str="GururaJ";
		char[] str1=str.toCharArray();
		int len=str1.length;

		for(int i=0;i<len;i++)
		{
			//ch=str.charAt(i);
			if(str1[i] >= 'a' && str1[i] <= 'z')
			{
				str1[i] = (char)((int)str1[i]-32) ;
			}else if (str1[i] >= 'A' && str1[i] <= 'Z'){
				str1[i] = (char)((int)str1[i]+32) ;
			}	
		}
		System.out.println("After converting the case of string = ");
		System.out.println(str1);
	}
}
