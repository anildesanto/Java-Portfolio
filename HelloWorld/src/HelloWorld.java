
public class HelloWorld
{

	public static void main(String[] args)
	{
		String helloWorld = "Hello World";
		printResult(helloWorld);
		printResult(operateOnNumbers(5,7,false));
		loopResult();
		arrayPractice();
		printResult(blackJack(10,25));
		printResult(uniqueSum(3,2,3));
		printResult(tooHot(90,true));
		Darrays darray = new Darrays();
		//arrays
		System.out.println("--------------------------------------");
		//darray.twoDArraysMoreColumns();
		darray.twoDArraysMoreRows();
		darray.whenTheIndexAndElementAreSame();
		
	}
	
	private static void printResult(String text)
	{
		System.out.println(text);
	}
	private static void printResult(int result)
	{
		System.out.print(result + ", ");
	}
	private static void printResult(boolean result)
	{
		System.out.print(result + ", ");
	}
	private static int operateOnNumbers(int number1, int number2,boolean isAddition)
	{
		if(number1 == 0)
			return number2;
			
		if(number2 == 0)
			return number1;
		
		if(isAddition)
			return number1+number2;
		else
			return number1*number2;
					
	}
	private static void loopResult()
	{
		for (int i = 0; i < 10; i++) 
		{
			if(i== 0)
			{
				printResult("\nLoop practice");
			}
			printResult(operateOnNumbers(i,2,true));
		}
	}
	private static void arrayPractice()
	{
		int [] arrayOfNumbers = new int[10];
		//populate array
		for (int i : arrayOfNumbers) 
		{
			i =i*10;
		}
		printResult("\nArray Operation");
		printResult(operateOnNumbers(arrayOfNumbers[0],arrayOfNumbers[2],false));
		
		for (int i = 0; i < arrayOfNumbers.length; i++) 
		{
			if(i== 0)
			{
				printResult("\nArray's content");
				printResult(arrayOfNumbers[i]);
			}
			else
				printResult(arrayOfNumbers[i]);	
		}
		
	}
	private static int blackJack(int number1, int number2)
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
	private static int uniqueSum(int number1, int number2, int number3)
	{
		printResult("\nUnique Sum");
		int sum = 0;
		if(number1 != number2 && number1 != number3 )
		{
			sum += number1;
		}
		if(number2 != number1 && number2 != number3 )
		{
			sum += number2;
		}
		if(number3 != number1 && number3 != number2 )
		{
			sum += number3;
		}
		
		return sum;
	}
	private static boolean tooHot (int temperature, boolean isSummer)
	{
		printResult("\nIs it Too Hot? ");
		boolean tooHot;
		if(isSummer)
		{
			if(temperature >= 60 && temperature <= 100)
				tooHot = true;
			else
				tooHot = false;
		}
		
		else
		{
			if(temperature >= 60 && temperature <= 90)
				tooHot = true;
			else
				tooHot = false;
		}
		return tooHot;
	}
}
