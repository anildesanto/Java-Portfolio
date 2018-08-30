
public class Chair 
{
	private String name;
	private boolean dosItBreak;
	private int weightCapacity;
	private Porridge porridge;
	
	public Chair(String name, boolean breaks, int weight, Porridge porridge)
	{
		this.name = name;
		dosItBreak = breaks;
		weightCapacity = weight;
		this.porridge = porridge;
	}
	public String getName()
	{
		return name;
	}
	public boolean getDosItBreak()
	{
		return dosItBreak;
	}
	public int getweightCapacity()
	{
		return weightCapacity;
	}
	public Porridge getporridge()
	{
		return porridge;
	}
	
	public void chairDescription()
	{
		System.out.println(String.format("This chair %s and it can handle %dkg",dosItBreak ? "breaks" : "does'nt break",weightCapacity));
		
	}
	
}
