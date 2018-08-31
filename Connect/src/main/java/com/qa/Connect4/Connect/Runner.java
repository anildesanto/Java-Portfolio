package com.qa.Connect4.Connect;

public class Runner {

	public static void main(String[] args) 
	{
		Piece blue = new Piece("blue",0,0);
		Piece red = new Piece("red",0,0);
		Player ani = new Player("Ani",blue);
		Player ben = new Player("Ben",red);
		
		Board board = new Board(6,7,ani,ben);
		board.intro();
	}

}
