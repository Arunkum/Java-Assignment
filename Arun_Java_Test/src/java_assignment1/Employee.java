package java_assignment1;

public class Employee extends Person implements CalculateTax
{
	int id;
	//boolean major;
	int empsalary;
	
	public Employee(String na, String add, int pn,int ID,int empsal) {
		super(na, add, pn);
		this.id = ID;
		this.empsalary = empsal;
		//this.major = Major;
		// TODO Auto-generated constructor stub
}

	 public String toString()
	    {
	      return "Employee" + super.toString() + ",id=" + id +",sal="+empsalary+"";
	}

	@Override
	public void taxCalculate()
	{
		double tax = empsalary*facultytax;
		System.out.println("The tax of faculty for the salary "+empsalary+"is "+tax);
		
	}
	

}
