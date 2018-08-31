package com.qa.Practicing.Practice;

public class Practice 
{
	public String stringBackWards(String str)
	{
		if(str.isEmpty())
		{
			System.out.println("===================== Print Backwards ===========================");
			return str;
		}
		else
		{
			return str.charAt((str.length()-1))+stringBackWards(str.substring(0,str.length()-1));
		}
	}
	public String last4CharsMissing(String str)
	{
		System.out.println("===================== Last 4 Letters Missing ===========================");
		if(str.length() > 4)
		return str.substring(0, str.length()-4);
		else
			return "You ended up with an empty string";
	}
	public String getStringInMiddle(String str)
	{
		System.out.println("===================== Get Middle String ===========================");
		String test = (String)str.subSequence(0, str.length());
		return test;
	}
}
