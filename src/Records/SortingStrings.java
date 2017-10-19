package Records;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Car3 
{
	String make;
	String model;
	int year;
	String plate;
}

public class SortingStrings {

	public static void main(String[] args) throws IOException {
		Car3 c3[] = new Car3[5];
		int i = 0;
		int result;

		Scanner k4 = new Scanner(System.in);

		System.out.println("Which file to open:");
		String file = k4.next();

		System.out.println("Reading data from " + file);
		Scanner s3 = new Scanner(new File(file));

		while (s3.hasNext()) {

			c3[i] = new Car3();
			c3[i].make = s3.next();
			c3[i].model = s3.next();
			c3[i].year = s3.nextInt();
			c3[i].plate = s3.next();
			i++;

		}
		System.out.println();
        System.out.println("before sorting");

		for (i = 0; i < c3.length; i++) {
			System.out.println(
					"car " + (i + 1) + " " + c3[i].make + " " + c3[i].model + " " + c3[i].year + " " + c3[i].plate);
		}

		for (i = 0; i < c3.length; i++) {
			for (int j = 0; j < c3.length; j++) {
				if (c3[i].make.compareTo(c3[j].make) < -1) {
					String a = c3[i].make;
					c3[i].make = c3[j].make;
					c3[j].make = a;
				}

			}
		}
		System.out.println();
		System.out.println("after sorting");
		for (i = 0; i < c3.length; i++) {
			System.out.println(
					"car " + (i + 1) + " " + c3[i].make + " " + c3[i].model + " " + c3[i].year + " " + c3[i].plate);
		}
		s3.close();
		k4.close();

	}

}
