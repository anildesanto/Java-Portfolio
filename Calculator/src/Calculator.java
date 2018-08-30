
public class Calculator 
{
	public String operation(int a,int b,int c)
	{
		String result = "Result is ";
		// a check
		result += operate(a,b,c);
		// b check
		result += operate(b,c,a);
		//c check
		result += operate(c,b,a);
		return result;
	}
	public String operate(int first, int second, int third)
	{
		//string division
		String divisionOperator= "/";
		String multiplyOperator= "x";
		String result1 = "";
		if (first*second==third) 
		{
			result1 += stringResult(first, second, third, multiplyOperator);
		}
		if (first*third==second)
		{
			result1 +=  stringResult( first,  third, second, multiplyOperator);	
		}
		if (first/second==third) 
		{
			result1 += stringResult(first, second, third, divisionOperator);
		}
		if (first/third==second)
		{
			result1 +=  stringResult( first,  third, second, divisionOperator);	
		}
		return result1;
	}
	public String stringResult(int number1, int number2, int number3, String operator)
	{
		return "\n" + number1 + operator+  number2 + " = " + number3;
	}
}
