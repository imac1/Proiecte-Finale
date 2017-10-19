package Arrays;

import java.util.Scanner;



public class TicTacToe
{

	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		initBoard();
		displayBoard();
		currentplayer();
	

	}
	
	
	
	public static void currentplayer()
	{
		
		
		Scanner keyboard = new Scanner(System.in);
		boolean n=true;
		char  currentplayer;
		
		int constant=0;
		
		while (n==true){
			displayBoard();
			constant++;
			char player1 = 'X';
			char player2 = 'O';
			if (constant %2 == 0)
			{
				currentplayer = player1;
				System.out.println(" X CHOOSE YOUR LOCATION (row, column)");
				int choice  = keyboard.nextInt();
				chooselocation();
				
			}
			else if (constant %2 != 0)
			{
				currentplayer = player2;
				System.out.println(" O CHOOSE YOUR LOCATION (row, column)" );
				int  choice  = keyboard.nextInt();
				chooselocation();
				
			}
			
		}  if (n==false)
		{
			System.out.println("The game is a tie");
		}
	}
	public static void chooselocation()
	
	{
		
		
		Scanner keyboard = new Scanner(System.in);
		int choice=0;
		char currentplayer= ' ';
		char[][] board = new char [3][3];
		
		  choice  = keyboard.nextInt();
		if (choice == 0 && choice == 0)
		{
			board[0][0] = currentplayer;
		}else if (choice == 0 && choice == 1)
		{
			board[0][1] = currentplayer;
		}else if (choice == 0 && choice == 2)
		{
			board[0][2] = currentplayer;
		}else if (choice == 1 && choice == 0)
		{
			board[1][0] = currentplayer;
		}else if (choice == 1 && choice == 1)
		{
			board[1][1] = currentplayer;
		}else if (choice == 1 && choice == 2)
		{
			board[1][2] = currentplayer;
		}else if (choice == 2 && choice == 0)
		{
			board[2][0] = currentplayer;
		}else if (choice == 2 && choice == 1)
		{
			board[2][1] = currentplayer;
		}else if (choice == 2 && choice == 2)
		{
			board[2][2] = currentplayer;
		}
		
	}

	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}


	public static void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}


	public static void displayBoard2()
	{
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
	}
}
