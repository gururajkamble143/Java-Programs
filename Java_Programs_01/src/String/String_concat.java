package String;

public class String_concat 
{
	public static void main(String[] args)
	{
		String str="Hello";
		String str1=" World";
		String str2=str.concat(str1);
		System.out.println(str2);
		
		String str3="hello".concat(" world");
		System.out.println(str3);
		
		String s1="Rahul";
		String s2=" Dravid";
		String s3=s1+s2;
		System.out.println(s3);
		
		String s4="Virat"+" Kohali";
		System.out.println(s4);
	}
}
