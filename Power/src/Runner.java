
public class Runner {

	public static void main(String[] args) 
	{
		int a = recursionPower(5,0);
		int b = recursionPower(5,1);
		int c = recursionPower(5,2);
		int d = recursionPower(5,3);
		System.out.println(a +"\n" +  b +"\n" + c+"\n" + d);
	}
	public static int recursionPower(int base, int power)
	{
		if(power == 0 )
		return 1;
		else
			return base * (recursionPower(base, power-1));
	}
}
