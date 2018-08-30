
public class Goldilock 
{
	private String name;
	private int weight;
	private int foodTemperature;
	
	public Goldilock(String name,int weight, int foodTemperature)
	{
		this.name = name;
		this.weight = weight;
		this.foodTemperature = foodTemperature;
	}
	
	public String bearDescription()
	{
		return 	String.format("%s weights %d and likes to eat porridge which temperature is %d",name,weight,foodTemperature);
	}
	public String getName()
	{
		return name;
	}
	public int getWeight()
	{
		return weight;
	}
	public int getFoodTemperature()
	{
		return foodTemperature;
	}
	public void setName(String bearName)
	{
		name = bearName;
	}
}
