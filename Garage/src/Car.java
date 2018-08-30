
public class Car extends Vehicle 
{
	int driveSpeed = 3;
	public Car(String name, int numberOfWheels, int numberOfWindows, int numberOfDoors, boolean engineOn,float price, int driveSpeed) 
	{
		super(name, numberOfWheels, numberOfWindows,numberOfDoors, engineOn, price);
		this.driveSpeed = driveSpeed;
		
	}
	public Car()
	{
		
	}
	
	public void vehicleDescription()
	{
		System.out.print(String.format("This is a %s and it has %d wheels, %d windows,"
				+ "%d doors and the engine is %s.\nIt runs at %d/km per hour",name, numberOfWheels, 
				numberOfWindows,numberOfDoors, engineStatus = engineOn ? "On" : "Off", driveSpeed));
	}
}
