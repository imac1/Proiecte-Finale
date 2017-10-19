package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NumsSum {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("C:\\Users\\Imac\\Desktop\\3nums.txt"));

		int n1, n2, n3;

		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		n3 = scanner.nextInt();
		System.out.println("the numebrs are " + n1 + " " + n2 + " " + n3);
		System.out.println("the sum of numers is " + (n1 + n2 + n3));

	}
}
