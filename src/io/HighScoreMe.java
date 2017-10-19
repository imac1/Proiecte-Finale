package io;
import java.util.Scanner;
import java.io.*;

public class HighScoreMe {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner hsme = new Scanner (System.in);
		
		System.out.println("You got a high score!");
		System.out.println("Please enter your score:");
		int score = hsme.nextInt();
		System.out.println("Please enter your name: " );
		String name = hsme.next();
		
		
		PrintWriter w2 = new PrintWriter("scoreMe.txt");
		
		w2.println(score);
		w2.println(name);
		w2.close();
		
		System.out.println("Data stored into scoreMe.txt.");
	}

}
