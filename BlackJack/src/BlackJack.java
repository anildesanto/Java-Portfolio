
public class BlackJack 
{
	private void printResult(String text)
	{
		System.out.println(text);
	}
	private void printResult(int result)
	{
		System.out.print(result + ", ");
	}
	private void printResult(boolean result)
	{
		System.out.print(result + ", ");
	}
	private int blackJack(int number1, int number2)
	{
		if(number1 < 21 && number2 < 21)
		{
			int number1Check = (21-number1);
			int number2Check = (21-number2);
			printResult("\nWhich number is closer to 21? "+number1+" or "+ number2 + "?");
			//compare numbers
			if(number1Check < number2Check)
			{
				printResult("Answer: "+ number1);
				return number1;
			}
			else
			{
				printResult("Answer: ");
				return number2;
			}
		}
		else
		{
			printResult("\nBlackjack Result ");
			return 0;
		}
	}
}
