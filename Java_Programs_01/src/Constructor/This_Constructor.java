class Cricketer
{
	String name;
	String team;
	int age;
	
	public
	Cricketer()        //default constructor
	{
		name = "";
		team = "";
		age=0;
	}
	Cricketer(String n,String t,int a)    //parameterized constructor
	{
		name = n;
		team =t;
		age=a;
	}
	Cricketer(Cricketer ckt)     //copy constructor
	{
		name = ckt.name;
		team = ckt.team;
		age = ckt.age;
	}
	Cricketer(String n,int a)         //this Keyword Constructor
	{
		this.name=n;
		this.age=a;
	}
	public String toString()
	{
		return "\nname= "+name+"\tteam= "+team+"\tage= "+age;
	}
}
public class This_Constructor {
	public static void main(String[] args)
	{
	Cricketer c1=new Cricketer();
	Cricketer c2=new Cricketer("Sachin","India",30);
	Cricketer c3=new Cricketer(c2);
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	}
}
