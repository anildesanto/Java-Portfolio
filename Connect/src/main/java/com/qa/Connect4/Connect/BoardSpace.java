package com.qa.Connect4.Connect;


public class BoardSpace 
{
	private Piece piece = null;
	public String dispalyPiece()
	{
		String toPrint="";
		if(piece != null)
		{
			toPrint += "[" + piece.getPieceColor().substring(0,1).toUpperCase() + "]";
		}
		else
		{
			toPrint += "[ ]";
		}
		
		return toPrint;
	}
	public Piece getPiece() 
	{
		return piece;
	}
	public void setPiece(Piece piece) 
	{
		this.piece = piece;
	}
	
}
