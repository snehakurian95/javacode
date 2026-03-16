package assignments;

public class Assignments49 
{
	String empName;
	int empid;
	double empSalary;
	void empDetails(String empName, int empid, double empSalary) 
	{
		this.empName= empName;
		this.empid= empid;
		this.empSalary= empSalary;
		
	}
	public static void main(String[] args) 
	{
		Assignments49 a1= new Assignments49();
		a1.empDetails("Trisha", 4563, 120000);
		System.out.println(a1.empName);
		System.out.println(a1.empid);
		System.out.println(a1.empSalary);
		
	}

}
