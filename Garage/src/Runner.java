
public class Runner 
{

	public static void main(String[] args) 
	{
		String motorcycleString ="Motorcycle";
		String carString ="Car";
		
		Car car = new Car("Smart", 4,2,5,true,17778.00f,45);
		Motorcycle bike = new Motorcycle ("Bike", 2,0,0,true,500.00f,200);
		Car car2 = new Car("Smart1", 4,2,5,true,17778.00f,45);
		Motorcycle bike2 = new Motorcycle ("Bike2", 2,0,0,true,500.00f,200);
		Garage garage = new Garage();
		
		garage.addVehicle(bike2);
		garage.addVehicle(car);
		garage.addVehicle(bike);
		garage.addVehicle(car2);
		garage.aboutVehicleInGarage();
		garage.vehicleInGarageBills();
		//garage.removeVehicle("Bike");
		garage.removeByType(motorcycleString);
		//garage.removeAllVehicles();
	}

}
