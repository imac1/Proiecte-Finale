package Arrays;
import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.io.BufferedWriter;
import java.io.File;

public class testarea {

	

	public static <T> void main(String[] args)  {
		// TODO Auto-generated method stub
		boolean n=true;
		int choice=0;
		
		char currentplayer=0;
		int counter=0;
		char[][] board = new char [3][3];
		
		
		while ( n){
		 counter++;
		 char player1= 'X';
			char player2 = 'O';
		
		 System.out.println( currentplayer + " enter a new value");
		
		 Scanner keyboard = new Scanner(System.in);
		choice  = keyboard.nextInt();
		if (counter%2 ==0){
		 currentplayer=player1;
		
		 if (choice == 0 && choice == 0)
			{
				board[0][0] = player1;
			}else if (choice == 0 && choice == 1)
			{
				board[0][1] = player1;
			}else if (choice == 0 && choice == 2)
			{
				board[0][2] = player1;
			}else if (choice == 1 && choice == 0)
			{
				board[1][0] = player1;
			}else if (choice == 1 && choice == 1)
			{
				board[1][1] = player1;
			}else if (choice == 1 && choice == 2)
			{
				board[1][2] = player1;
			}else if (choice == 2 && choice == 0)
			{
				board[2][0] = player1;
			}else if (choice == 2 && choice == 1)
			{
				board[2][1] = player1;
			}else if (choice == 2 && choice == 2)
			{
				board[2][2] = player1;
			}
		
			
		}else if (counter%2 !=0){
			
			currentplayer=player2;
			if (choice == 0 && choice == 0)
			{
				board[0][0] = player2;
			}else if (choice == 0 && choice == 1)
			{
				board[0][1] = player2;
			}else if (choice == 0 && choice == 2)
			{
				board[0][2] = player2;
			}else if (choice == 1 && choice == 0)
			{
				board[1][0] = player2;
			}else if (choice == 1 && choice == 1)
			{
				board[1][1] = player2;
			}else if (choice == 1 && choice == 2)
			{
				board[1][2] = player2;
			}else if (choice == 2 && choice == 0)
			{
				board[2][0] = player2;
			}else if (choice == 2 && choice == 1)
			{
				board[2][1] = player2;
			}else if (choice == 2 && choice == 2)
			{
				board[2][2] = player2;
			}
			
		}
		
		 System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
			System.out.println("    --+-+--");
			System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
			System.out.println("    --+-+--");
			System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
			System.out.println("     0 1 2 ");
		
		
	}
			}
}
			

	




