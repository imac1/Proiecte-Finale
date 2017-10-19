package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SumSeveralNumfromAnyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;
		int sum = 0;

		PrintWriter f4 = new PrintWriter("4nums.txt");
		PrintWriter f5 = new PrintWriter("5nums.txt");
		PrintWriter f6 = new PrintWriter("6nums.txt");
	
		
		Scanner kb2 = new Scanner(System.in);

		System.out.println("name your file");
		String scannerinp = kb2.next();

		Scanner scanner = new Scanner(new File(scannerinp));

		while (scanner.hasNext())
		{
			
			n = scanner.nextInt();
			 System.out.println("the numbers are " + n + "");
			
			 sum += n;
		}
		System.out.println("the sum of numers is " + sum);
		scanner.close();
		kb2.close();
	}

}
