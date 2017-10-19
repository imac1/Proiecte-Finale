package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SumNrANYFile {

	public static void main(String[] args) throws IOException {
		
		String scannerinp;
		int n1, n2, n3;
		
		PrintWriter f1 = new PrintWriter("3nums1.txt");
		PrintWriter f2 = new PrintWriter("3nums2.txt");
		PrintWriter f3 = new PrintWriter("3nums3.txt");
		
		Scanner kb2 = new Scanner(System.in);

		System.out.println("name your file");
		 scannerinp = kb2.next();
		
		Scanner scanner = new Scanner(new File(scannerinp));

while(scanner.hasNext())
{
	n1 = scanner.nextInt();
	n2 = scanner.nextInt();
	n3 = scanner.nextInt();
	System.out.println("the numbers are " + n1 + " " + n2 + " " + n3);
	System.out.println("the sum of numers is " + (n1 + n2 + n3));
}
		
scanner.close();
kb2.close();
	}

}
