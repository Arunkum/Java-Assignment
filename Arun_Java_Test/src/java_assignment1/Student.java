package java_assignment1;

public class Student extends Person
{

	int id;
	boolean major = false;
	
	public Student(String na, String add, int pn,int ID,boolean Major) {
		super(na, add, pn);
		this.id = ID;
		this.major = Major;
		// TODO Auto-generated constructor stub
}

	 public String toString()
	    {
	      return "Student" + super.toString() + ",id=" + id + ",major="+major+"";
	}




}
