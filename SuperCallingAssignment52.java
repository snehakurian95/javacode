package assignments;
class WaterFallModel
{
	WaterFallModel(int a,int rollno)
	{
		System.out.println("Waterfall Model- Fixed Requirement");
	}
}

class SpiralModel extends WaterFallModel
{
	SpiralModel(String a)
	{
		super(34, 546);
		System.out.println("Spiral Model- Application provided in phases");
	}
}

public class SuperCallingAssignment52 extends SpiralModel
{
	SuperCallingAssignment52()
	{
		super("Gianna");
		System.out.println("Both are types of Software Development Life Cycle");
	}
	
	public static void main(String[] args) 
	{
		SuperCallingAssignment52 sc= new SuperCallingAssignment52();
	}
}
	


