class Cricket
{
	String name;
	String team;
	int age;
	
	public
	Cricket()        //default constructor
	{
		name = "";
		team = "";
		age=0;
	}
	Cricket(String n,String t,int a)    //parametrized constructor
	{
		name = n;
		team =t;
		age=a;
	}
	Cricket(Cricket ckt)     //copy constructor
	{
		name = ckt.name;
		team = ckt.team;
		age = ckt.age;
	}
	public String toString()
	{
		return "\nname= "+name+"\tteam= "+team+"\tage= "+age;
	}
}
public class Constructor 
{
	public static void main(String[] args)
	{
		Cricket c1=new Cricket();
		Cricket c2=new Cricket("Sachin","India",30);
		Cricket c3=new Cricket(c2);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
