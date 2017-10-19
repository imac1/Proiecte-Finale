package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class vowelsMe {

	public static void main(String[] args) throws IOException {
		char a, e, i, o, u;
		File vowelstxt = new File("vowels.txt");

		Scanner kb3 = new Scanner(System.in);
		System.out.println("what file to open: ");

		String filenm = kb3.nextLine();
		Scanner vowelsSc = new Scanner(new File(filenm));
		String txt = vowelsSc.nextLine();

		for (int x = 0; x < txt.length(); x++) {
			
			char t = txt.charAt(x); // finds a letter, space, whatever at charAt(x)
			
			if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u') {
				System.out.print(Character.toUpperCase(t));
			} else
				System.out.print(t);
		}
		kb3.close();
		vowelsSc.close();

	}

}
