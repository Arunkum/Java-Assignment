package java_assignment2;

public class Faculty_Portal extends WhiteBoxtTraining implements Message
{

	public Faculty_Portal(String housing, String transporation, String course,String Attendance,String assignment) {
		super(housing, transporation, course);
		// TODO Auto-generated constructor stub
	}

	private int Attendance;
	private String Assignments;
	
	public int getAttendance()
	{
		return Attendance;
	}
	
	public void setAttendance(int attend)
	{
		this.Attendance = attend;
		
	}
	
	public String getAssignments()
	{
		return Assignments;
	}
	
	public void setAssignments(String assign)
	{
		this.Assignments = assign;
	}


	@Override
	public void input() {
		System.out.println("This implements inbox of faculty portal");
		
		
	}

	@Override
	public void output() {
		System.out.println("This implements outbox of faculty portal");
		
	}
}
