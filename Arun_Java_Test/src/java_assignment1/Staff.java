package java_assignment1;

public class Staff extends Employee implements CalculateTax
{

	String title;
	
	
	public Staff(String na, String add, int pn,int ID,int empsal,String titl) {
		super(na, add, pn,ID,empsal);
		this.title= titl;
		//this.major = Major;
		// TODO Auto-generated constructor stub
}
	

	@Override
	public void taxCalculate() 
	{
		double tax = empsalary*facultytax;
		System.out.println("The tax of staff for the salary "+empsalary+"is "+tax);
		
		
	}
	 public String toString()
	    {
	      return "Staff" + super.toString() + ",title=" + title +"";
	}
	
	 


}
