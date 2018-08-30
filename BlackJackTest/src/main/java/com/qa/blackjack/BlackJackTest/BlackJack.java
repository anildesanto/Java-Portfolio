package com.qa.blackjack.BlackJackTest;

public class BlackJack 
{
	public void printResult(String text)
	{
		System.out.println(text);
	}
	public void printResult(int result)
	{
		System.out.print(result + ", ");
	}
	public void printResult(boolean result)
	{
		System.out.print(result + ", ");
	}
	public int blackJack(int number1, int number2)
	{

		printResult("\nWhich number is closer to 21? "+number1+" or "+ number2 + "?");
		if(number1 > 21 && number2 < 21)
		{
			return number2;
		}
		if(number2 > 21 && number1 < 21)
		{
			return number1;
		}
		if(number1 < 21 && number2 < 21)
		{
			int number1Check = (21-number1);
			int number2Check = (21-number2);
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

