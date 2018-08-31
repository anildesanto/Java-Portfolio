package com.qa.Connect4.Connect;

import java.util.Random;
import java.util.Scanner;

public class Board 
{
	private BoardSpace[][] my2dArray = new BoardSpace[6][7];
	private Player[]  players = new Player[2];
	private Scanner sc = new Scanner(System.in);
	private Random rand = new Random();
	
	public Board(int arrayX, int arrayY, Player player1, Player player2)
	{
		my2dArray = new BoardSpace [arrayX][arrayY];
		players[0] = player1; 
		players[1] = player2; 
	}
//===============================================
	public void intro()
	{
		initializeBoard();
		Piece blue = new Piece("blue",0,0);
		Piece red = new Piece("red",0,0);
		Piece chosen = null;
		System.out.println("Hey there, whats your name?");
		String name = sc.nextLine();
		System.out.println("Which color do you want to use?");
		String color = sc.next();
		if(color.equals(blue.getPieceColor()))
			chosen = blue;
		else
			chosen = red;
		
		Player player = new Player(name,chosen);
		players[0] = player;
		updatedBoard();
		askForInput(player);
	}
	public void askForInput(Player player)
	{
		System.out.println("Choose from the " + my2dArray.length + " rows available");
		int input = sc.nextInt();
		addPieceToBoard(player.getPieceType(),input);
		askForInput(player);
		
	}
	public void computerPlay()
	{
		Piece red = new Piece("red",0,0);
		Player computer = new Player("Ben",red);
		players[1] = computer;
		int playerMove = rand.nextInt(my2dArray.length -1)+1;
		addPieceToBoard(computer.getPieceType(),playerMove);
	}
	public void initializeBoard()
	{
		System.out.println("=========================================================");
		System.out.println("Lets play Connect 4!");
		System.out.println("=========================================================");
		for (int i = 0; i < my2dArray.length; i++)
		{
			for (int j = 0; j < my2dArray[i].length; j++) 
			{
				my2dArray[i][j] = new BoardSpace();
			}
		}
	}
	public void updatedBoard()
	{
		for (int i = 0; i < my2dArray.length; i++)
		{
			for (int j = 0; j < my2dArray[i].length; j++) 
			{
				System.out.print(my2dArray[i][j].dispalyPiece());
			}
			System.out.println("");
				
		}
		
		System.out.println("=========================================================");
		checkForWin();
	}
	public void addPieceToBoard(Piece piece, int row)
	{
		row--;

		if(row > my2dArray[0].length)
			row = my2dArray.length-1;
		if(row < 0)
			row = 0;
			
		for (int i = my2dArray.length-1; i >= (my2dArray.length-my2dArray.length); i--) 
		{
			for (int j = 0; j < 1; j++) 
			{
				if(my2dArray[i][row].getPiece() == null)
				{
					my2dArray[i][row].setPiece(piece);
					updatedBoard();
					return;
				}
			}
		}
	}
	public void checkForWin()
	{
		String winnerName = "";
		int [] playerWins = new int[2];
		
		for (int i = 0; i < my2dArray.length; i++) 
		{
			for (int j = 0; j < my2dArray[i].length; j++) 
			{
				checkPlayerPieces(i,j,playerWins);
			}
			resetPlayePiecesCount(playerWins);
		}
		for (int i = 0; i < my2dArray.length; i++) 
		{
			for (int j = 0; j < 1; j++) 
			{
				checkPlayerPieces(i,j,playerWins);
			}
		}

		resetPlayePiecesCount(playerWins);
	}
	public void resetPlayePiecesCount(int [] playerWins)
	{
		for (int playerIndex = 0; playerIndex < players.length; playerIndex++) 
		{
			playerWins[playerIndex] = 0;
		}
	}
	public void checkPlayerPieces(int i,int j,int [] playerWins)
	{
		Piece previousPeice;
		for (int playerIndex = 0; playerIndex < players.length; playerIndex++) 
		{
			if(my2dArray[i][j].getPiece() != null)
			{
				//--------------------
				if(!my2dArray[i][j].getPiece().equals(my2dArray[i][0].getPiece()))
					previousPeice = my2dArray[i][j-1].getPiece();
				else 
					previousPeice = my2dArray[i][j].getPiece();
				//--------------------------
				
				if(my2dArray[i][j].getPiece() == players[playerIndex].getPieceType())
				{
					playerWins[playerIndex] ++;
					System.out.println(players[playerIndex].getName()+ " has " + playerWins[playerIndex] + " connected in row " + (j+1));
					if (playerWins[playerIndex] == 4) 
					{
						System.out.println(players[playerIndex].getName()+" Wins!");
					}
				}
				else
				{
					playerWins[playerIndex] = 0;
				}
			}
		}
	}
}
