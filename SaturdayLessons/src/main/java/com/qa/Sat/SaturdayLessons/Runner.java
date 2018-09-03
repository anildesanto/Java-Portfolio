package com.qa.Sat.SaturdayLessons;

import java.util.ArrayList;

public class Runner 
{

	public static void main(String[] args) 
	{
		Circle c = new  Circle();
		doDrawing(c);
		Draw s = new  Square();
		doDrawing(c,s);
		StringManipulation stM = new StringManipulation();
		
		stM.printWordsInNextLine2("Hello my friend");
		stM.printWordsInNextLine3("Hello my friend");
		stM.printWordsBackwards("Hello my friend");
		stM.printWordsBackwards2("Hello my friend");
		stM.printWordsBackwards3("Hello my friend");
		Maths mt = new Maths();
		try 
		{
			mt.divide(3, 4);
		}
		catch (DivideBy5Exception e) 
		{
			e.printStackTrace();
		}
		stM.countSub("Lol is a way of life. we cannot life without lol", "lol");
	}

	public static void doDrawing(Draw x)
	{
		x.drawing();
	}
	public static void doDrawing(Draw x,Draw y)
	{
		x.drawing();
		y.drawing();
	}
	
	
}

