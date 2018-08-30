import java.text.DecimalFormat;

public class Player 
{
	private String name;
	private float[] coordinates = new float [2];
	
	private float nCoordinates = 0;
	private float eCoordinates = 0;
	
	public Player(String name,float nCoordinates,float eCoordinates)
	{
		this.name = name;
		this.coordinates[0] = nCoordinates;
		this.coordinates[1] = eCoordinates;
	}
	//=====================================
	
	public String getName()
	{
		return this.name;
	}
	public float[] getCoordinates()
	{
		return coordinates;
	}
	public void updateCoordinates(float[] coordinates)
	{
		this.coordinates = coordinates;
	}

	public String printCoordinates()
	{
		DecimalFormat df = new DecimalFormat("0.00");
		return "Player Coordinates: " + df.format(getCoordinates()[0]) +", "+ df.format(getCoordinates()[1]);
	}
	public float distanceCheck()
	{
		float distance = 0;
		for (float i : coordinates) 
		{
			distance += i;
		}
		return distance;
	}
}
