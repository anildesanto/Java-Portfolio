
import javax.swing.plaf.FontUIResource;

public class PrimeNumber
{	
	int limit = 10000;
	StringBuilder numbers = new StringBuilder();
	public void calculate()
	{
		
		for (int i = 1; i < limit; i++) 
		{
			if(i == 2)
			{
				numbers.append(i);
			}
			if( i%2 != 0)
			{
				if(checkPrime(i) == 0)
				numbers.append("\n "+ i);
			}
		}
		System.out.println(numbers);
	}
	public int checkPrime(int number)
	{
		for (int i = 2; i <= limit; i++) 
		{
			for (int j = 2; j < limit; j++) 
			{
				if(i*j == number || number == 1)
				{
					return number;
				}
			}
		}
		return 0;
	}
}

