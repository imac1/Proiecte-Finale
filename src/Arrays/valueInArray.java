package Arrays;

import java.awt.Container;
import java.awt.List;
import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class valueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valueOf[] = new int[10];
		int i = 0;
		boolean c = false;
		int counter = 0;

		for (i = 0; i < valueOf.length; i++) {
			valueOf[i] = (int) (Math.random() * 100);
			System.out.print(valueOf[i] + "\t");
		}
		System.out.println();
		Scanner kb = new Scanner(System.in);
		System.out.println("value to find: ");

		int value = kb.nextInt();
		for (i = 0; i < valueOf.length; i++) {
			if (valueOf[i] == value) {
				c = true;
				counter++;
			}
		}
		if (c == false)
			System.out.println(value + " is  NOT in the array");
		else 
		{
			System.out.println(value + " is in the array");
			System.out.println(value + " was found " + counter + " times");
		}

	}
}
