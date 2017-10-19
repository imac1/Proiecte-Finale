package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class LetterToYourself {
	
	// writing info into a txt file from keyboard or code

	public static void main(String[] args) throws IOException {

		File LetterToYourself = new File("Letter to yourself"); // declares the new object
		Scanner kb = new Scanner (System.in);

		LetterToYourself.createNewFile(); // creates the file

		String content = " +---------------------------------------------+";
		
		System.out.println("enter a string ");
		String input = kb.next();

		OutputStream outStream = new FileOutputStream(LetterToYourself);

		outStream.write(content.getBytes()); // writes the actual string into file
		outStream.write(input.getBytes());

		outStream.close();

	}
}
