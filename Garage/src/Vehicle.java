
public abstract class Vehicle 
{
	protected String name;
	protected int numberOfWheels;
	protected int numberOfWindows;
	protected int numberOfDoors;
	protected boolean engineOn;
	protected String engineStatus;
	protected float price = 0.0f;
	
	public Vehicle (String name, int numberOfWheels, int numberOfWindows,int numberOfDoors, boolean engineOn, float price)
	{
		this.name = name;
		this.numberOfWheels = numberOfWheels;
		this.numberOfWindows = numberOfWindows;
		this.numberOfDoors = numberOfDoors;
		this.engineOn = engineOn;
		this.price = price;
	}
	public Vehicle ()
	{
		
	}
	public String getName()
	{
		return name;
	}
	public String calculateBill()
	{
		return name + " Bill price is: £" + price*2;
	}
	public abstract void vehicleDescription();
}
