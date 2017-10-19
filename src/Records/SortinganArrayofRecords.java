package Records;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Car2 
{
	String make;
	String model;
	int year;
	String plate;
}

public class SortinganArrayofRecords {

	public static void main(String[] args) throws IOException {
		Car2 c2[] = new Car2[5];
		int i = 0;

		Scanner k3 = new Scanner(System.in);

		System.out.println("Which file to open:");
		String file = k3.next();

		System.out.println("Reading data from " + file);
		Scanner s3 = new Scanner(new File(file));

		while (s3.hasNext()) {

			c2[i] = new Car2();
			c2[i].make = s3.next();
			c2[i].model = s3.next();
			c2[i].year = s3.nextInt();
			c2[i].plate = s3.next();
			i++;

		}
		System.out.println();
        System.out.println("before sorting");

		for (i = 0; i < c2.length; i++) {
			System.out.println(
					"car " + (i + 1) + " " + c2[i].make + " " + c2[i].model + " " + c2[i].year + " " + c2[i].plate);
		}

		for (i = 0; i < c2.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (c2[i].year < c2[j].year) {
					int a = c2[i].year;
					c2[i].year = c2[j].year;
					c2[j].year = a;
				}

			}
		}
		System.out.println();
		System.out.println("after sorting");
		for (i = 0; i < c2.length; i++) {
			System.out.println(
					"car " + (i + 1) + " " + c2[i].make + " " + c2[i].model + " " + c2[i].year + " " + c2[i].plate);
		}
		s3.close();
		k3.close();
	}

}
