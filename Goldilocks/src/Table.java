import java.util.ArrayList;

public class Table
{
	ArrayList<Chair> table = new ArrayList<Chair>();
	
	public void addChair(Chair chair)
	{
		table.add(chair);
	}
	public void removeChair(Chair chair)
	{
		table.remove(chair);
	}
	public void tableContents()
	{
		int amountOfChairs = 0;
		for (Chair chair : table)
		{
			amountOfChairs += 1;
		}
		
		System.out.println("This table has " + amountOfChairs + " chairs.");
	}
	public void whereCanBearEat(Goldilock bear)
	{
		String canEat ="Bear Can't eat here" ;
		String chairs = "";
		int chairsAvailable = 0;
		for (Chair chair : table) 
		{
			if(bear.getWeight() <= chair.getweightCapacity())
			{
				if(chair.getporridge().getTemperature() <= bear.getFoodTemperature())
				{
					canEat ="Bear Can eat here";
					chairs += String.format("\n%s \n%s can sit in chair named %s  which weight capacity is %d "
							+ "and can eat the porridge which temperature is %d",
							bear.bearDescription(),bear.getName(),chair.getName(),chair.getweightCapacity(),
							chair.getporridge().getTemperature());
					
					chairsAvailable++;
				}
			}
		}
		if(chairsAvailable > 0)
		{
			System.out.println(canEat + " There are " + chairsAvailable + " tables available :)");
			System.out.println(chairs);
		}
		else
		{
			System.out.println(canEat);
		}
	}
}
