package com.qa.Connect4.Connect;

public class Piece 
{
	private int[] position = new int [2];
	private String pieceColor;

	public Piece (String pieceColor, int positionX, int positionY)
	{
		this.pieceColor = pieceColor;
	}
//=================================================
	public int[] getPosition() 
	{
		return position;
	}

	public void setPosition(int[] position) 
	{
		this.position = position;
	}

	public String getPieceColor() 
	{
		return pieceColor;
	}

	public void setPieceColor(String pieceColor) 
	{
		this.pieceColor = pieceColor;
	}
}
