package String;

public class Duplicate_character 
{
	public static void main(String[] args)
	{
		String str = "Gururaj Kamble";
		int count=1;
		
		char String[]= str.toCharArray(); 
        System.out.println("Duplicate characters in a given string: ");
        
        for(int i = 0;i < str.length(); i++)
        {
        	count=1;
        	for(int j = i+1 ; j < str.length(); j++)
        	{
        		if(String[i] == String[j] && String[i] != ' ')
        		{
        			String[j]='0';
        			count++;
        		}
        	}
        	if(count > 1 && String[i] != '0' && String[i]!=' ')  
            System.out.println(String[i]);
        }
	}
}
