package io;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SimpleFileInp2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File sfinp =  new File("C:\\Users\\Imac\\Desktop\\simplefileinp2.txt");
		// adress of the file on the disk
		FileReader filetoread = new FileReader(sfinp);
		// a filereader is a connection stream that connects to a txt file
		BufferedReader finalreader = new BufferedReader(filetoread);
		// buffered reader reads the contents of the connection
		
		String line = null; // a string variable that holds each line to read
		
		while ((line=finalreader.readLine())!=null) // read a line of a text nad assign it to the string variable line
			//while that line is not null print it out
		{
		System.out.println(line);	
		}
	finalreader.close();	
	}

}
