
public class Factorials 
{
	public void factorialDivide(int number, int divider) 
	{
		int value = number;
		
		
		for (int i = 1 ; i < divider; i++)
		{
			System.out.println(value = value / i);
		}
		if (value  != divider) 
		{
			System.out.println("None");
		}
		else
		{
			System.out.println(number + " = "+ divider + "!");
		}
		
	}
	public void testFactorialDivide(int number, int divider) 
	{
		int value = 1;
		for (int i = 1 ; i < divider ; i++)
		{
			if(i ==1)
				value *= (divider*(divider-i));
			else
				value *= divider-i;
			System.out.println(" Value: "+ value + "!");
		}
		if(value == number)
		{
			System.out.println(number + " = "+ divider + "!");
		}
		else
		{
			System.out.println(number + " None");
		}
	}
}
