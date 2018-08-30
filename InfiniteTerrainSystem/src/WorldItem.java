import java.text.DecimalFormat;

public class WorldItem 
{
	private String name;
	private float[] coordinates = new float [2];
	private float nCoordinates = 0;
	private float eCoordinates = 0;
	private String description = "";
	private boolean found;
	
	public WorldItem(String name,float nCoordinates,float eCoordinates,String description )
	{
		this.name = name;
		this.coordinates[0] = nCoordinates;
		this.coordinates[1] = eCoordinates;
		this.description = description;
	}
	//=============================================
	
	public float[] getCoordinates()
	{
		return coordinates;
	}
	public String getName()
	{
		return name;
	}
	public boolean getFound()
	{
		return found;
	}
	public void setFound(boolean f)
	{
		found = f;
	}
	public String printCoordinates()
	{
		DecimalFormat df = new DecimalFormat("0.00");
		return "Item Coordinates: " + df.format(getCoordinates()[0]) +", "+ df.format(getCoordinates()[1]);
	}
	public String description()
	{
		return String.format("You found a " + name + "\n" + description);
	}
	public void updateCoordinates(float[] coordinates)
	{
		this.coordinates = coordinates;
	}
	
}
