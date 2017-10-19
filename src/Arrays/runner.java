package Arrays;

import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Board board = new Board();
		String winner = playgame(board);
		printBoard(board);
		printWinner(winner);
	}

	private static String playGame(Board board) 
	{

		Player playerX = new Player('X', board);
		Player playerO = new Player('0', board);
		
		Scanner kb = new Scanner(System.in);

		Player currPlayer;
		int turnCount = 0;
		int play;
		boolean keepPlaying = true;
		boolean hasWon = false;
		String winner = "Tie";
		
		while (keepPlaying) {
			
			printBoard(board);
			turnCount++;
			if (turnCount % 2 == 0) {
				currPlayer = playerX;
			} else {
				currPlayer = playerO;
			}
			System.out.println(currPlayer.getName() + " choose a square " );
			play = kb.nextInt();
			
			hasWon = currPlayer.makePlay(Player.cells[play - 1]);
			
			if (hasWon)
			{
			    winner = currPlayer.getName();
			    keepPlaying = false;
			}
			if (turnCount == 9) 
			{
			    keepPlaying = false;
			}
		}
		return winner;
			
			
		}
	
	private static void printWinner(String winner)
	{
		
		if (winner.equals("Tie")) {
			   System.out.println("It's a tie!");
			} else {
			   System.out.println(winner + " won!");
			}
	}
	

	private static void printBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	private static String playgame(Board board) {
		// TODO Auto-generated method stub
		return null;
	}

}
