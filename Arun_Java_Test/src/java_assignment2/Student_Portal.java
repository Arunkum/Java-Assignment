package java_assignment2;

public class Student_Portal extends WhiteBoxtTraining implements Message
{
	private String Address;
	private String Name;
	
	
public Student_Portal(String housing, String transportation, String course, String Address,String Name) {
		super(housing, transportation, course);
		// TODO Auto-generated constructor stub
	}





public String getAddress() {
	return Address;
}


public void setAddress(String address) {
	Address = address;
}

public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}



@Override
public void input() {
	
	System.out.println("This implements inbox of Student Portal");
	
}


@Override
public void output() {
	System.out.println("This implements outbox of Student Portal");
	
}


}
