package java_assignment1;


public class Test {

	public static void main(String[] args) 
	{
		boolean True = false;
		Student student = new Student("Mark","Address123",98745,1236,True);
		
		Employee emply = new Employee("John", "Address3265", 986458, 456,25000);
		
		
		Staff staff = new Staff("Jim", "Address987", 985689, 789,35000,"HOD");
		
		
		Faculty fac = new Faculty("Tom","Address569", 96589, 485, 89000, "Department","Mech");
		
		
		System.out.println(student);
		System.out.println();
		
		System.out.println(emply);
		emply.taxCalculate();
		System.out.println();
		
		System.out.println(staff);		
		staff.taxCalculate();
		System.out.println();
		
		System.out.println(fac);
		fac.taxCalculate();
		
				
				

	}

}
