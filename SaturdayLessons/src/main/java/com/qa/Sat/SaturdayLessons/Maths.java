package com.qa.Sat.SaturdayLessons;

public class Maths 
{
	public void divide(int a, int b )throws DivideBy5Exception
	{
		System.out.println("======================== Divide number ==========================");
		if(b == 5)
		{
			DivideBy5Exception e  = new  DivideBy5Exception();
			throw e;
		}
		System.out.println("The result of "+ a + "/"+ b +" is: " + (float)a/b);
	}
}
