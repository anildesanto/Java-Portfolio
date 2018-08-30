
import java.util.ArrayList;

public class Swamp 
{
	private ArrayList<WorldItem> swamp = new ArrayList<WorldItem>();
	
	public ArrayList<WorldItem> getSwampList()
	{
		return swamp;
	}
	
	public void addToSwamp(WorldItem item)
	{
		swamp.add(item);
	}
	public void addRemoveFromSwamp(WorldItem item)
	{
		swamp.remove(item);
	}
}
