package code;

public class OfflineExercises 
{

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) 
	{
		String changeInput = "";
		for (int i = 0; i < input.length(); i++) 
		{
			changeInput += input.charAt(i);
			changeInput += input.charAt(i);
			changeInput += input.charAt(i);
		}
		return changeInput;
	}
	//
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "elivc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) 
	{
		String all = "";
		int start = 0;
		int end = 0;
		int bertApperance = 0;
		for (int i = 0; i < input.length(); i++)
		{
			int length =  (input.length()-1)-3;
			if (i <= length)
			{
				String str = input.substring(i,4+i);
				if(str.toLowerCase().equals("bert") )
				{
					if(bertApperance == 0)
					{
						start = input.indexOf(input.charAt(4+i));
					}
					if(bertApperance == 1)
					{
						end = i;
					}
					bertApperance++;
				}
				
			}
		}
		if(bertApperance == 2)
		return stringBackWards(input.substring(start,end));
		else
			return "";
	}
	public String stringBackWards(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		else
		{
			return str.charAt((str.length()-1))+stringBackWards(str.substring(0,str.length()-1));
		}
	}
	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c)
	{
		int small = 0;
		int medium = 0;
		int large = 0;
		large = findLarge(a,b,c);
		small = findSmall(a,b,c);
		medium = findMedium (a,b,c);
		
		if(small + medium == large)
			return true;
		else
			return false;
	}
	public int findMedium(int numb1, int numb2, int numb3)
	{
		if(numb1 > numb2 && numb1 <numb3 || numb1 < numb2 && numb1 > numb3)
			return numb1;
		else if(numb2 > numb3 && numb2 < numb1 || numb2 < numb3 && numb2 > numb1)
			return numb2;
		else if(numb3 > numb1 && numb3 < numb2 || numb3 < numb1 && numb3 > numb2)
			return numb3;
		else return 0;
	}
	public int findLarge(int numb1, int numb2, int numb3)
	{
		if(numb1 > numb2 && numb1 >numb3)
			return numb1;
		else if(numb2 > numb1 && numb2 >numb3)
			return numb2;
		else if(numb3 > numb1 && numb3 >numb2)
			return numb3;
		else return 0;
	}
	public int findSmall(int numb1, int numb2, int numb3)
	{
		if(numb1 < numb2 && numb1 < numb3)
			return numb1;
		else if(numb2 < numb1 && numb2 <numb3)
			return numb2;
		else if(numb3 < numb1 && numb3 < numb2)
			return numb3;
		else return 0;
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) 
	{
		String finalS = "";
		finalS += input.substring(0, a);
		finalS += input.substring(input.length()-a);
		return finalS;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("cooldev") → true
	// endsDev("jh") → false
	// endsDev("coolev") → false

	public boolean endsDev(String input) 
	{
		return (input.toLowerCase().endsWith("dev"));
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "xxppp9"
	// yields "xp9".

	// RECURSIVE

	// stringClean("xxppp9") → "xp9"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Heellooo") → "Helo"
	public String stringClean(String input) 
	{
		if(input.isEmpty())
		{
			return input;
		}
		else
		{
			if(!input.isEmpty())
			{
				if(input.substring(input.length()-2) == input.substring(input.length()))
				return ".";
				else
					return input;
			}
			else
			return input + stringClean(input.substring(0, input.length()-1));
		}
	}

	// Each subsequent Fibonacci value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the sum of
	// the first
	// n numbers.

	// RECURSIVE

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 2
	// fibonacci(7) → 33

	public int fibonacci(int input) 
	{
		if(input == 0)
			return 0;
		else if(input == 1)
			return 1;
		else
			return (fibonacci(input-1) + fibonacci(input-2)+1);
	}

	// Given a number multiply that number by 2 - using recursion
	// do not use any loops

	// RECURSIVE

	// simpleRecursion(0) → 0
	// simpleRecursion(1) → 2
	// simpleRecursion(2) → 4

	public int simpleRecursion(int input) 
	{
		if(input == 0)
			return 0;
		else if(input == input *2)
			return input;
		else
		{
			return simpleRecursion(input-1)+2;
		}
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) 
	{
		int previousCount = 0;
		int count = 0;
		for (int i = 0; i < input.length(); i++) 
		{
			if(i == 0)
			{
				count ++;
			}
			else
			{
				if(input.charAt(i) == input.charAt((i-1)))
				{
					count ++;
					previousCount = count+1;
				}
				else
				{
					if(count > previousCount)
					previousCount = count;
					
					count = 0;
				}
			}
		}
		return previousCount;

	}

}
