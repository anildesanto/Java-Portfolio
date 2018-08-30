import java.util.Scanner;

public class Runner 
{

	public static void main(String[] args) 
	{
		WorldItem chair1 = new WorldItem("Broken Chair",5,7,"You can't really use it for anything.");
		WorldItem chest = new WorldItem("Chest",8,14, "You are rich! congratulations! You won the game!");
		WorldItem puddle = new WorldItem("Puddle",2,7,"Not very interesting.");
		//=======================================
	
		Swamp swamp = new Swamp();
		//===========================================
		swamp.addToSwamp(chest);
		swamp.addToSwamp(chair1);
		swamp.addToSwamp(puddle);
		//==============================================
		//=======================
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey there, what is your name?");
		String name = sc.nextLine();
		Player player = new Player(name, 1,4);
		
		System.out.println("Hey "+name +", grey foggy clouds float oppressively close to you\nreflected in the murky grey water which reaches up your shins."
				+ "\nSome black plants barely poke out of the shallow water. You came here for a reason. now find the treasure!");
		System.out.println("\nWhere do you want to go? north, south, east or west?");
		String direction;
		Compass magicCompass = new Compass("Magic Swamp",player,swamp,chest.getName());
		//=================
		while(!magicCompass.gameEndStatus())
		{
			direction = sc.next();
			magicCompass.getInput(direction);
		}
		sc.close();
	}

}
