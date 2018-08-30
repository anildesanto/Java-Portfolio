import java.util.Random;
import java.util.Scanner;

public class RPS 
{
	private  int totalGamesPlayed;
	private int computerWins;
	private int playerWins;
	private int ties;
	private boolean isGameOver;
	
	 public int convertInput(String input)
	 {
		 int converted = 0;
		 switch(input)
		 {
		 case "paper":
		 case "Paper":
			 converted = 1;
			 break;
		 case "rock" :
		 case "Rock" :
			 converted = 2;
			 break;
		 case "scissors":
		 case "Scissors":
		 case "Scissor":
		 case "scissor":
			 converted = 3;
			 break;
		 }
		 return converted;
	 }
	 public String convertToString(int input)
	 {
		 String converted = "";
		 switch(input)
		 {
		 case 1:
			 converted = "Paper";
			 break;
		 case 2 :
			 converted = "Rock";
			 break;
		 case 3:
			 converted = "Scissors";
			 break;
		 }
		 return converted;
	 }
	 public void quit()
	 {
		 System.out.println("----------------------------------------------------------------------------");
		 System.out.println("Game ended");
		 System.out.println("----------------------------------------------------------------------------");
		 System.out.println("Total Games Played: " + totalGamesPlayed);
		 System.out.println("Total Computer Wins: " + computerWins);
		 System.out.println("Total Player Wins: " + playerWins);
		 System.out.println("Total Ties: " + ties);
		 
	 }
	 public void continueGame()
	 {
		 if(isGameOver == false)
		{
			 for (int i = 0; i < 20; i++) 
			 {
				 runGame();
			 }
			 isGameOver = true;
		}
		 quit();
	 }
	 public void runGame( )
	 {
		Random rand = new Random();
		int aiOutPut = rand.nextInt(3)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("choose Rock, Paper or Scissors "); 
		
		String playerInput = sc.nextLine();
		outcome(convertInput(playerInput),aiOutPut );
	 }
	public void outcome(int pValue, int cValue)
	{
		if(pValue == 0)
		{
			isGameOver = true;
			return;
		}
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("You played - " + convertToString(pValue) + " Computer played - " + convertToString(cValue)  );
		System.out.println("----------------------------------------------------------------------------");
		if((pValue == 1 && cValue == 1) ||(pValue == 2 && cValue == 2) || (pValue == 3 && cValue == 3))
		{
			ties++;
			System.out.println("Its a Tie");
		}
		if((pValue == 1 && cValue == 2) || (pValue == 2 && cValue == 3) || (pValue == 3 && cValue == 1))
		{
			playerWins++;
			System.out.println("You win");
		}
		if((cValue == 1 && pValue == 2) || (cValue == 2 && pValue == 3) || (cValue == 3 && pValue == 1))
		{
			computerWins++;
			System.out.println("Computer Wins");
		}
		totalGamesPlayed++;
	}
}
