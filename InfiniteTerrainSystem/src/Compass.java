import java.util.ArrayList;
import java.text.DecimalFormat;

public class Compass 
{
	private String name;
	private Player player;
	private Swamp gameWorld;
	private boolean gameEnd;
	private String itemToFind;
	public boolean gameEndStatus()
	{
		return gameEnd;
	}
	public Compass(String name,Player player,Swamp swamp, String itemToFind)
	{
		this.name = name;
		this.player = player;
		this.gameWorld = swamp;
		
	}
	public void getInput(String direction)
	{
		System.out.println("\nWhere do you want to go now? north, south, east or west?");
		switch (direction)
		{
			case "north" :
				moveNorth0();
				break;	
			case "south" :
				moveSouth1();
				break;	
			case "east" :
				moveEast2();
				break;	
			case "west" :
				moveWest3();
				break;	
				default:
					System.out.println("\nWrong Input, Try again");
		}
		checkClosestItem();
	}
	public void moveNorth0()
	{
		player.getCoordinates()[0] ++;
	}
	public void moveSouth1()
	{
		player.getCoordinates()[0] --;
	}
	public void moveEast2()
	{
		player.getCoordinates()[1] --;
	}
	public void moveWest3()
	{
		player.getCoordinates()[1] ++;
	}
	public void checkClosestItem()
	{
		ArrayList<WorldItem> swamp = gameWorld.getSwampList();
		WorldItem closesItem = null;
		float distance = 0;
		String itemName = "";
		String textToPrfloat = "The Compass reads " + distance + "m" + " The item name is " + itemName;
		for (WorldItem item : swamp) 
		{
			if(closesItem == null)
			{
				closesItem = item;
			}
			else
			{
				if(distanceCheck(item) < distanceCheck(closesItem) &&  item.getFound() == false)
				{
					closesItem = item;
				}
			}
			if(distanceCheck(item) == 0)
			{
				closesItem.setFound(true);
				System.out.println(item.description() + "\n"+  item.printCoordinates() + "\n" + player.printCoordinates());
				if(closesItem.getName().equals(itemToFind))
				{
					gameEnd = true;
				}
			}
		}

		DecimalFormat df = new DecimalFormat("0.00");
		distance = distanceCheck(closesItem);
		itemName = closesItem.getName();
		if(distance != 0)
			System.out.println("The Compass reads " + df.format(distance) + "m" + " The item name is " + itemName);
	}
	public float distanceCheck(WorldItem item)
	{
		float north =  item.getCoordinates()[0] - player.getCoordinates()[0];
		float west = item.getCoordinates()[1] - player.getCoordinates()[1];
		return (float)Math.sqrt((Math.pow(north, 2)+Math.pow(west, 2)));
	}
}
