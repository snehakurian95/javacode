package assignments;
class Appliance
{
	void poweron() 
	{
		System.out.println("Machine is powered on");
	}
	void poweroff() 
	{
		System.out.println("Machine is powered off");
	}
	
}

public class WashingMachine extends Appliance
{
	static void brand()
	{
		System.out.println("Brand name: Samsung");
	}
	static void capacity()
	{
		System.out.println("Capacity: 10kg");
	}
	void startwashcycle()
	{
		System.out.println("Started to wash the clothes");
	}
	void rinse()
	{
		System.out.println("Rinsing the clothes");
	}
	public static void main(String[] args) 
	{
		brand();
		capacity();
		
		WashingMachine wm= new WashingMachine();
		wm.poweron();
		wm.startwashcycle();
		wm.rinse();
		wm.poweroff();
		
	}

}
