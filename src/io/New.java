package io;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;

public class New {

	

	public static void main(String[] args) throws IOException {
		

		File fisier = new File ("C:\\Users\\Imac\\workspace\\make1\\fisier.txt");
		File L2 = new File ("C:\\Users\\Imac\\workspace\\make1\\L2.txt");
		
		fisier.createNewFile();
	
		String string = L2.toString();
		
		System.out.println("fisierul exista "+ fisier.exists());
		System.out.println("enter a word " );
		
		String create = "";
		int n=45;
		String aleluia = "20";
		
		Scanner keyboard = new Scanner (System.in);
		create = keyboard.nextLine();
	
		PrintWriter printer = new PrintWriter(fisier);
		
		printer.write(create);
		printer.write(aleluia);
		printer.write(string);
		printer.close();
		
		
	}

}
