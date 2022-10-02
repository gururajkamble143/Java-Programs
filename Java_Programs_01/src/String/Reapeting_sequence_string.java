package String;

public class Reapeting_sequence_string 
{
	public static String common(String s, String t)
	{
		int n=Math.min(s.length(),t.length());
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)!=t.charAt(i))
			{
				return s.substring(0,i);
			}
		}
		return s.substring(0,n);		
	}
	public static void main(String[] args)
	{
		String str = "traningtrain";
		String repeat=" ";
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				String x=common(str.substring(i,len),str.substring(j,len));
				if(x.length()>repeat.length()) repeat=x;
			}
		}
		System.out.println("Repeating Sequence = "+repeat);
	}
}
