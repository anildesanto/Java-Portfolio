package com.qa.Connect4.Connect;

public class Player 
{
	private String name;
	private Piece pieceType;
	
	public Player(String name, Piece pieceType)
	{
		this.name = name;
		this.pieceType = pieceType;
	}
//===================================================
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Piece getPieceType()
	{
		return pieceType;
	}

	public void setPieceType(Piece pieceType) 
	{
		this.pieceType = pieceType;
	}

	
}
