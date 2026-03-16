package ab61;
class Vehicle
{
	static void start()	
	{
		System.out.println("Vehicle started");
	}
}
class Car extends Vehicle
{
	static void drive()	
	{
		System.out.println("Car is driving");
	}
}
class SportsCar extends Car
{
	static void accelerate()	
	{
		System.out.println("Sports Car accelerating rapidly");
	}
}

public class VehicleMultiClass  extends SportsCar
{
	static void stop() 
	{
		System.out.println("Car is stopped");
	}
	public static void main(String[] args) 
	{
		start();
		drive();
		accelerate();
		
	}
}
	
