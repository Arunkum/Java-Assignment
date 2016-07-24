package java_assignment1;

public class Person 
{
	protected  String Name;
	protected  String Address;
	protected int Phonenumber;
	
	public Person(String na,String add, int pn)
	{
		this.Name = na;
		this.Address = add;
		this.Phonenumber = pn;
	}
	
	
	
	
	public String toString()
	{
	  return "Name=" + Name + ",Address=" + Address +",Phonenumber="+Phonenumber +"";
}

}
