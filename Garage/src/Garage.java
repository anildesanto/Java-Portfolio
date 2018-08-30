import java.util.ArrayList;

public class Garage 
{
	ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
	public void addVehicle (Vehicle vehicle)
	{
		System.out.println(vehicle.getName() + " Added to ArrayLis");
		garage.add(vehicle);
	}
	public void removeVehicle (Vehicle vehicle)
	{
		System.out.println(vehicle.getName() + " Removed from ArrayList");
		garage.remove(vehicle);
	}
	public void removeByType(String type)
	{
		ArrayList<Vehicle> toDelete = new ArrayList<Vehicle>(); 
		for (Vehicle vehicle : garage) 
		{
			if(vehicle.getClass().getName() == type)
			{
				toDelete.add(vehicle);
			}
		}
		if(toDelete.size()>0)
		{
			for (Vehicle vehicle : toDelete) 
			{
				removeVehicle(vehicle);
			}
			System.out.println("All vehicles of type " + type +" were removed from ArrayList");
		}
		else
		{
			System.out.println("Vehicle "+type+" not found");
		}
			
	}
	public void removeVehicle (String name)
	{
		for (Vehicle vehicle : garage) 
		{
			if(vehicle.getName() == name)
			{
				removeVehicle(vehicle);
				return;
			}
		}
		System.out.println("Vehicle "+name+" not found");
	}
	public void removeAllVehicles ()
	{
		System.out.println("All vehicles were removed from ArrayList");
		garage.removeAll(garage);
	}
	public void aboutVehicleInGarage()
	{
		for (Vehicle vehicle : garage) 
		{
			vehicle.vehicleDescription();
		}
	}
	
	public void vehicleInGarageBills()
	{
		if(garage.size() > 0)
		System.out.println("Cars in garage and description");
		
		for (int i = 0; i < garage.size(); i++) 
		{
			System.out.println((i+1) +" - " + garage.get(i).calculateBill());
		}
		
	}
}
