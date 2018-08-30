
public class Runner {

	public static void main(String[] args) 
	{
		int x = recursionPower(5,3);
		System.out.println(x);
	}
	public static int recursionPower(int base, int power)
	{
		if(power == 0 )
		return 1;
		else
			return base * (recursionPower(base, power-1));
	}
}
