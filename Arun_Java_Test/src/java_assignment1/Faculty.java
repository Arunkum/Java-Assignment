package java_assignment1;

public class Faculty extends Employee implements CalculateTax
{
	String Department;
	String COurse;
		
		
		public Faculty(String na, String add, int pn,int ID,int empsal,String depart,String cour) {
			super(na, add, pn,ID,empsal);
			this.Department= depart;
			this.COurse = cour;
			//this.major = Major;
			// TODO Auto-generated constructor stub
	}


		@Override
		public void taxCalculate() {
			
			double tax = empsalary*facultytax;
			System.out.println("The tax of faculty for the salary "+empsalary+"is "+tax);
		}
		
		 public String toString()
		    {
		      return "Staff" + super.toString() + ",Department=" + Department +",Course"+COurse+"";
		}

}
