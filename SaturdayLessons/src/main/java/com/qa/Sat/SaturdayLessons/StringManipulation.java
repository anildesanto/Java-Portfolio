package com.qa.Sat.SaturdayLessons;

import java.util.ArrayList;

public class StringManipulation 
{
	public void countSub(String text, String sub)
	{
		int count = 0;
		System.out.println("======================== How may times does "+sub+ " appear in "+text+ " ==========================");
		for (int i = 0; i < text.length(); i++) 
		{
			int length = (text.length()-1)-(sub.length()-1);
			if(i <= length)
			{
				String sub2 = text.substring(i, i+sub.length());
				if(sub2.toLowerCase().equals(sub))
				{
					count++;
				}
			}
		}
		System.out.println(sub+ " Appears " + count+ " times");
	}
	public void printWordsBackwards(String str)
	{
		System.out.println("======================== Print 1 Split ==========================");
		String value = "";
		String output[] = str.split(" ");
		for (int i = 0; i < output.length; i++) 
		{
			value += "\n" +output[i];
		}
		System.out.println(value);
	}
	public void printWordsInNextLine2(String str)
	{
		System.out.println("======================== Print 2 Split ==========================");
		String output[] = str.split(" ");
		String value = "";
		for (int i = output.length-1; i >= 0; i--) 
		{
			value += "\n" +output[i];
		}
		System.out.println(value);
	}
	public void printWordsInNextLine3(String str)
	{
		System.out.println("======================== Print 3 Substring ==========================");
		String value = "";
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.substring(i, i+1).equals(" "))
			value += "\n";
			else
				value += str.charAt(i);
		}
		System.out.println(value);
	}
	public void printWordsBackwards2(String str)
	{
		System.out.println("======================== Print 4 Substring Backwards ==========================");
		String value = "";
		String valueTemp = "";
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.substring(i, i+1).equals(" "))
			{
				value = "\n" + valueTemp + value;
				valueTemp = "";
			}
			else if(i == str.length()-1)
			{
				valueTemp += str.charAt(i);
				value = "\n" + valueTemp + value;
			}
			else
				valueTemp += str.charAt(i);
		}
		System.out.println(value);
	}
	public void printWordsBackwards3(String str)
	{
		System.out.println("======================== Print 5 Backwards ArrayList ==========================");
		ArrayList<String> output = new ArrayList<String>(); 
		String temp = "";
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.substring(i, i+1).equals(" "))
			{
				output.add(temp);
				temp = "";
			}
			else if(i == str.length()-1)
			{
				temp += str.charAt(i);
				output.add(temp);
			}
			else
			{
				temp += str.charAt(i);
			}
		}
		for (int i = output.size()-1; i >= 0; i--) 
		{
			System.out.println(output.get(i));
		}
	}
}
